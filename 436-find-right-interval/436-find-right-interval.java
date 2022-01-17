class Solution {
    public int[] findRightInterval(int[][] intervals) {
        List<Pair<Pair<Integer, Integer>, Integer>> sorted = new ArrayList();
        int n = intervals.length;
        //need to save the actual index first
        for(int i = 0; i < n; i++){
            sorted.add(new Pair(new Pair(intervals[i][0], intervals[i][1]), i));
        }
        
        Collections.sort(sorted, (a, b) -> a.getKey().getKey() - b.getKey().getKey());
        
        int[] result = new int[n];
        for(int i = 0; i < n; ++i)
            result[i] = binary_search(sorted, intervals[i][1]);
        
        return result;
    }
    
    private int binary_search(List<Pair<Pair<Integer, Integer>, Integer>> sorted, int target){
        int len = sorted.size();
        if(sorted.get(len-1).getKey().getKey() < target) return -1;
        
        int l = 0, r = len - 1; 
        
        while(l <= r){
            int mid =  l + (r - l) / 2;
            
            if(sorted.get(mid).getKey().getKey() >= target) r = mid - 1;
            else l = mid + 1;
        }
        return sorted.get(l).getValue();
    }
}