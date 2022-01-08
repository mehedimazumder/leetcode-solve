class Solution {
    public int rob(int[] nums) {
        // https://www.youtube.com/watch?v=73r3KWiEvyk
        int rob1 = 0, rob2 = 0;
        
        for(int num : nums){
            int temp = Math.max(rob1 + num, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        
        return rob2;
    }
    
   
}





