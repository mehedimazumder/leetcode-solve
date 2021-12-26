class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int[] account:accounts){
            int sum = 0;
            for(int num:account)
                sum+=num;
            
            ans = sum > ans ? sum : ans;
        }
        return ans;
    }
}