class Solution {
    int[] dp = new int[366];
    int[] daysTravel = new int[]{1,7,30};
    public int mincostTickets(int[] days, int[] costs) {
        Arrays.fill(dp, -1);
        return costFinder(days, costs, 0, 0);
    }
    
    public int costFinder(int[] days, int[] costs, int index, int day){
        if(index >= days.length) return 0;
        
        if(index > 0 && days[index] < day)
            return costFinder(days, costs, index+1, day);
        
        if(dp[index] != -1) return dp[index];
        
        int cost = Integer.MAX_VALUE;
        
        for(int i = 0; i < daysTravel.length; i++){
            cost = Math.min(cost, costs[i] + costFinder(days, costs, index+1, days[index] + daysTravel[i]));
        }
        
        return dp[index] = cost;
    }
}