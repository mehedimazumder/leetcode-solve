class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length < 2) return 0;
        
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        
        int count = 0;
        int[] previous = intervals[0];
        
        for(int i = 1; i < intervals.length; i++){
            int[] current = intervals[i];
            
            if(current[0] < previous[1]){
                count++;
            }else{
                previous = current;
            }
                
        }
        
        return count;
    }
}