class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int winSum = 0;
        int minLen = Integer.MAX_VALUE;
        int l = 0;
        
        for(int r = 0; r < nums.length; r++){
            winSum += nums[r];
            
            while(winSum >= target){
                int len = r - l + 1;
                minLen = len < minLen ? len : minLen;
                winSum -= nums[l++];
            }
        }
        if(minLen == Integer.MAX_VALUE)
            return 0;
        return minLen;
    }
}