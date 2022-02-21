class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int winSum = 0;
        double maxAvg=-Double.MAX_VALUE;
        
        int l = 0;
        
        for(int r = 0; r < nums.length; r++){
            winSum += nums[r];
            
            if(r >= k - 1){
                double avg = winSum / (double) k;
                maxAvg = avg > maxAvg ? avg : maxAvg;
                winSum -= nums[l++];
            }
        }
        return maxAvg;
    }
}