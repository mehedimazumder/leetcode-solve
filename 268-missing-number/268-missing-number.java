class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        
        int i = 0;
        
        while(i < len){
            int corrIdx = nums[i];
            
            if(corrIdx < len && nums[i] != nums[corrIdx])
                swap(nums, i, corrIdx);
            else
                i++;
        }
        
        for(int k = 0; k < len; k++){
            if(nums[k] != k)
                return k;
        }
        return len;
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}