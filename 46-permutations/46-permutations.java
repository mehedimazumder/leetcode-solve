class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        allPerms(nums, curr, result);
        return result;
    }
    public void allPerms(int[] nums, List<Integer> curr, List<List<Integer>> res)     {
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }    
        
        for(int i = 0; i < nums.length; i++){
            if(curr.contains(nums[i])) continue;
            
            curr.add(nums[i]);
            allPerms(nums, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}