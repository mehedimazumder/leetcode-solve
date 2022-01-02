class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int requiredNum = target - nums[i];
            
            if(visitedNumbers.containsKey(requiredNum))
                return new int[] {visitedNumbers.get(requiredNum), i};
            else
                visitedNumbers.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}