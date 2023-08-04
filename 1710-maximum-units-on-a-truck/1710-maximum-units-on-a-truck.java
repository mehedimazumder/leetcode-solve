class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        final int[] bucket = new int[1001];
        
        for (int[] item : boxTypes) {
            bucket[item[1]] += item[0];
        }
        
        int maxUnits = 0;
        int remainingSize = truckSize;
        for (int i = bucket.length - 1; i > -1; i--) {
            if (bucket[i] == 0) continue;
            
            if (bucket[i] >= remainingSize) {
                maxUnits += remainingSize * i;
                return maxUnits;
            } else {
                maxUnits += bucket[i] * i;
                remainingSize -= bucket[i];
            }
        }
        return maxUnits;
    }
}