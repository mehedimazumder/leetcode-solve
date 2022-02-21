class Solution {
    public int maxProfit(int[] prices) {
        // using DP
        int minP = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        
        for(int price : prices){
            if(price < minP){
                minP = price;
            }else if(price - minP > maxProfit){
                maxProfit = price - minP;
            }
        }
        return maxProfit == Integer.MIN_VALUE ? 0 : maxProfit;
    }
}