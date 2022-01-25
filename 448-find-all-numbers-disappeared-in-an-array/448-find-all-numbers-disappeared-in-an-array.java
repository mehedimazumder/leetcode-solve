class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        
        int i = 0;
        
        while(i < len){
            int corrIdx = nums[i] - 1;
            
            if(nums[i] <= len && nums[i] != nums[corrIdx])
                swap(nums, i, corrIdx);
            else
                i++;
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int k = 0; k < len; k++){
            if(nums[k] != k + 1)
                ans.add(k+1);
        }
        
        return ans;
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}