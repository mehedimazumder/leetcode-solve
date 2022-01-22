class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        int start = 0;
        int end = nums.length - 1;
        int ans = 0;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if((mid > 0  && nums[mid] == nums[mid -1]) || (mid < nums.length - 1 &&  nums[mid] == nums[mid +1]))
            {
                ans = nums[mid];
                break;
            }
            else if(mid < nums[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        
        return ans;
    }
}