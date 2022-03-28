class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        subsets(nums, 0, result, curr);
        return result;
    }
    
    public void subsets(int[] nums, int idx, List<List<Integer>> result, List<Integer> subset){
        if(idx == nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }
        
        subset.add(nums[idx]);
        subsets(nums, idx+1, result, subset);
        subset.remove(subset.size() - 1);
        subsets(nums, idx+1, result, subset);
    }
}