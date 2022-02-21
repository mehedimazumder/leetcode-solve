class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int n:nums)
            set.add(n);
        
        if(set.size() == nums.length)
            return false;
        
        return true;    
            
    }
}