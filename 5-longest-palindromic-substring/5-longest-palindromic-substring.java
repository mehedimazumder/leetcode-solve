class Solution {
     Integer resLength = 0;
     Integer resStart = 0;
    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
        
        for(int i = 0; i< s.length(); i++){
            expandRange(s, i, i);
            expandRange(s, i, i+1);
        }
        
        return s.substring(resStart, resStart + resLength);
    }
    
    private void expandRange(String s, int start, int end){
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        if(resLength < end - start - 1){
            resStart = start+1;
            resLength = end - start - 1;
        }
    }
}