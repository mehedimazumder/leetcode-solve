class Solution {
    public int[] shuffle(int[] nums, int n) {
        // Constraint: 1 <= nums[i] <= 10^3, So,
        int base = 1005;
        
        for(int i = 0; i < n; i++)
            nums[n + i] += nums[i] * base;
        
        for(int i = 0; i < n; i++){
            nums[2 * i] = nums[n + i] / base;
            nums[2 * i + 1] = nums[n + i] % base;
        }
        return nums;
    }
}