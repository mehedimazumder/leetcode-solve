public class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        
        int i = 0;
        
        while(i < len){
            int corrIdx = nums[i] - 1;
            
            if(nums[i] <= len && nums[i] > 0 && nums[i] != nums[corrIdx])
                swap(nums, i, corrIdx);
            else
                i++;
        }
        
        for(int k = 0; k < len; k++){
            if(nums[k] != k + 1)
                return k+1;
        }
        return len + 1;
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
