class Solution {
    public List<String> generateParenthesis(int n) {
        if(n == 1) return List.of("()");
        return combinations("", 0, 0, n);
    }
    
    public List<String> combinations(String p, int open, int closed, int n){
        if(open == n && closed == n){
            return List.of(p);
        }
        
        List<String> res = new ArrayList<>();
        if(open < n)
            res.addAll(combinations(p+"(", open+1, closed, n));
        if(closed < open)
            res.addAll(combinations(p+")", open, closed+1, n));
        
        return res;
    }
}