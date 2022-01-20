class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Arrays.stream(piles)
      .max()
      .getAsInt();
        int res = end;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            int hours = 0;
            for(int p = 0; p < piles.length; p++)
                hours += Math.ceil(1.0 * piles[p] / mid);
            
            if(hours <= h){
                res = mid;
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        return res;
    }
}