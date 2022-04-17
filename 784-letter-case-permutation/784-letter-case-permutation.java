class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        perm("", s, res);
        return res;
    }
    
    public void perm(String p, String up, List<String> result){
        if(up.isEmpty()){
            result.add(p);
            return;
        }
        
        Character curr = up.charAt(0);
        
        if(Character.isLetter(curr)){
            perm(p + Character.toLowerCase(curr), up.substring(1), result);
            perm(p + Character.toUpperCase(curr), up.substring(1), result);
        }else
            perm(p + curr, up.substring(1), result);
    }
}