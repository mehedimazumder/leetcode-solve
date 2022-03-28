class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        subsetsWithDup(nums, 0, curr, result);
        return result;
    }
    
    public void subsetsWithDup(int[] nums, int idx, List<Integer> curr, List<List<Integer>> result) {
        if(idx == nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        
        curr.add(nums[idx]);
        subsetsWithDup(nums, idx+1, curr, result);
        curr.remove(curr.size() - 1);
        
        while(idx + 1 < nums.length && nums[idx] == nums[idx+1])
            idx++;
        subsetsWithDup(nums, idx+1, curr, result);
    }
}