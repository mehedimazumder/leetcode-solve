// https://www.youtube.com/watch?v=x8WVCreZHMo
class Solution {
    public long maxTaxiEarnings(int n, int[][] rides) {
        Map<Integer, List<int[]>> trips = new HashMap<>();
        
        for(int[] ride: rides){
            if(trips.containsKey(ride[1])){
                trips.get(ride[1]).add(ride);
            }else{
                trips.put(ride[1], new ArrayList<>(Arrays.asList(ride)));
            }
        }
                        
       long[] dp = new long[n+1];  
       
       for(int i = 2; i <= n; i++){
           List<int[]> values = trips.get(i);
           
           if(values != null){
               long earning = 0;
               
               for(int[] trip : values){
                   earning = Math.max(earning, trip[1] - trip[0] + trip[2] + dp[trip[0]]);
               }
               dp[i] = earning;
           }
           dp[i] = Math.max(dp[i], dp[i-1]);
       }
        return dp[n];
    }
}