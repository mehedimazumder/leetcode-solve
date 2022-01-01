class Solution {
    public int[] buildArray(int[] nums) {
       int len = nums.length;
       for(int i = 0; i < len; i++)
           nums[i] = nums[i] + (nums[nums[i]] % len) * len;

       for(int i = 0; i < len; i++)
           nums[i] = nums[i] / len;
            
        return nums;
    }
}