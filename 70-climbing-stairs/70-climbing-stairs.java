class Solution {
    public int climbStairs(int n) {
        // https://www.youtube.com/watch?v=Y0lT9Fck7qI
        int one = 1, two = 1;
        
        for(int i = 1; i < n; i++){
            int temp = one;
            one = one + two;
            two = temp;
        }
        return one;
    }
}