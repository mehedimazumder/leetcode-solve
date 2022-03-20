class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length < 2) return intervals;
        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        List<int[]> res = new ArrayList<>();
        
        int[] start = intervals[0];
        
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] > start[1]){
                res.add(start);
                start = intervals[i];
            }else{
                start[1] = Math.max(start[1], intervals[i][1]);
            }
        }
        res.add(start);
        
        return res.toArray(new int[res.size()][]);
    }
}