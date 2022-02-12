class Solution {
    public int characterReplacement(String s, int k) {
        // https://www.youtube.com/watch?v=gqXU1UyA8pk
        int[] map = new int[26];
        int res = 0;
        
        int l = 0;
        int maxF = 0;
        
        for(int r = 0; r < s.length(); r++){
            int idx = s.charAt(r) - 'A';
            map[idx]++;
            maxF = Math.max(maxF, map[idx]);
            if((r - l + 1) - maxF > k){
                int lIdx = s.charAt(l) - 'A';
                map[lIdx]--;
                l++;
            }
            res = Math.max(r - l + 1, res);
        }
        return res;
    }
}