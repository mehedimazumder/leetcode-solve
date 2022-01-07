class Solution {
    public boolean canJump(int[] nums) {
        int lastGoodIdxPosition = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] + i >= lastGoodIdxPosition)
                lastGoodIdxPosition = i;
        }
        return lastGoodIdxPosition == 0;
    }
}