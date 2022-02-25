class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // time C: O(N * logN + N^2);
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            searchPair(nums, nums[i], i+1, triplets);
        }
        return triplets;
    }
    
    private void searchPair(int[] nums, int num, int start, List<List<Integer>> triplets){
        int end = nums.length - 1;
        
        while(start < end){
            int sum = num + nums[start] + nums[end];
            
            if(sum == 0){
                triplets.add(Arrays.asList(num, nums[start], nums[end]));
                
                start++;
                end--;
                while(start < end & nums[start] == nums[start - 1])
                    start++;
                
                while(start < end & nums[end] == nums[end + 1])
                    end--;
            }else if(sum > 0)
                end--;
            else
                start++;
        }
    }
}