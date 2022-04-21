class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return Collections.emptyList(); 
        String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; 
        return combinations("", digits, letters);
    }
    
    public List<String> combinations(String p, String up, String[] letters){
        if(up.isEmpty()){
            return List.of(p);
        }
        
        char[] lts = letters[up.charAt(0) - '2'].toCharArray();
        
        List<String> res = new ArrayList<>();
        
        for(char ch:lts){
            res.addAll(combinations(p + ch, up.substring(1), letters));
        }
        return res;
    }
}