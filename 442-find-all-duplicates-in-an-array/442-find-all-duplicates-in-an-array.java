class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       int len = nums.length;
        
        int i = 0;
        
        List<Integer> ans = new ArrayList<>();
        while(i < len){
            int corrIdx = nums[i] - 1;
            
            if(nums[i] != nums[corrIdx])
                swap(nums, i, corrIdx);
            else
                i++;
        }
        
        for(int k = 0; k < len; k++){
            if(nums[k] != k + 1)
                ans.add(nums[k]);
        }
        return ans;
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}