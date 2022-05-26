class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s);
        String rev= sb.reverse().toString();
        return longestCommonSubsequence(s, rev);
    }
    
   public int longestCommonSubsequence(String text1, String text2) {
        int[][] counts = new int[text1.length()+1][text2.length()+1];
        
        
        for(int i = 1; i <= text1.length(); i++){
            char ch1 = text1.charAt(i-1);
            for( int j = 1; j <= text2.length(); j++){
                char ch2 = text2.charAt(j-1);
                
                if(ch1 == ch2){
                    counts[i][j] = 1 + counts[i-1][j-1];
                }else{
                    counts[i][j] = Math.max(counts[i-1][j], counts[i][j-1]);
                }
            }
        }
        return counts[counts.length-1][counts[0].length-1];
    }
}







