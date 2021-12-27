class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        
        int first = occuranceSearch(nums, target, true);
        int last = occuranceSearch(nums, target, false);
        
        ans[0] = first;
        ans[1] = last;
        
        return ans;
    }
    
    static int occuranceSearch(int[] nums, int target, boolean isFirstOccurance){
        int ans = -1;
        
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(isFirstOccurance)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return ans;
    }
}