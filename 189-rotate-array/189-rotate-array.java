class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);
    }
    
    private void reverseArray(int[] nums, int fromIdx, int toIdx){
        while(fromIdx < toIdx){
            swap(nums, fromIdx, toIdx);
            fromIdx++;
            toIdx--;
        }
    }

    
    private void swap(int[] nums, int m, int n){
        nums[m] -= nums[n];
        nums[n] += nums[m];
        nums[m] = nums[n] - nums[m];
    }
}