class Solution {
    public int maxProduct(int[] nums) {
        //dp
        int max = 1;
        int min = 1;
        // int res = Arrays.stream(nums).max().getAsInt();
        int res = nums[0];
        
        for(int n:nums){
            int tmp = n * max;
            max = Math.max(Math.max(n * max, n * min), n);
            min = Math.min(Math.min(tmp, n * min), n);
            res = Math.max(res, max);
        }
        return res;
    }
}