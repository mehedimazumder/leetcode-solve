class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       Set<Integer> matchingNums = new HashSet<>();
        
       for(int i = 0; i < nums.length; i++) {
           if(i > k) matchingNums.remove(nums[i - k - 1]);
           if(!matchingNums.add(nums[i])) return true;
       }
        return false;
    }
}