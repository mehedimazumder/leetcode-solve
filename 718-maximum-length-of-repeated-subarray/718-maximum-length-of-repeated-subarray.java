class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int[][] counts = new int[nums1.length+1][nums2.length+1];  
        int max = 0;
        
        for(int i = 1; i < counts.length; i++){
            for(int j = 1; j < counts[0].length; j++){
                if(nums1[i-1] == nums2[j-1])
                    counts[i][j] = 1 + counts[i-1][j-1];
                max = Math.max(counts[i][j], max);
            }
        }
        return max;
    }
    
}