class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        
        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;
        
        for(int num:nums){
            localMax = Math.max(localMax + num, num);
            if(localMax > globalMax)
                globalMax = localMax;
        }
        return globalMax;
    }
}