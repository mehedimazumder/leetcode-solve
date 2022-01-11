class Solution {
      public boolean search(int[] nums, int target) {
        int s=0,e=nums.length-1;
        while(s<=e){
            // check for both the positions
            if(nums[s]==target || nums[e]==target){
                return true;
            }
            else if(target>nums[s]){
                // since there can be duplicate values so we need to skip all the 
                // duplicate values in the given array
                while(s<e && nums[s]==nums[s+1]){
                    s++;
                }
                s++;
            }
            else if(target<nums[e]){
                // skipping duplicate values for the end as well
                while(s<e && nums[e-1]==nums[e]){
                    e--;
                }
                e--;
            }
            else{
                break;
            }
        }
        return false;
    }
}