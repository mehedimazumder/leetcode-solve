class Solution {
    int count = 0;
    public int countSubstrings(String s) {
        if(s.length() <= 1) return 1;
        // count = s.length();
        
        for(int i = 0; i< s.length(); i++){
            expandRange(s, i, i);
            expandRange(s, i, i+1);
        }
        return count;
    }
    
    private void expandRange(String s, int start, int end){
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
            count++;
        }
        // if(end - start - 1 > 1){
        //     count++;
        // }
    }
}