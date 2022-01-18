class Solution {
    // https://www.youtube.com/watch?v=MjpAAE3-hYg
    public int maxValue(int n, int index, int maxSum) {
        long l = index; // left portion
        long r = n - index - 1; // right portion
        
        long start = 1;
        long end = maxSum;
        long res = 0;
        
        while(start <= end){
            long mid = start + (end - start) / 2;
            long sum = mid;
            long lSum = 0;
            long rSum = 0;
            long m = mid - 1;
            
            if(r <= m)
                rSum = (m*(m+1) / 2) - ((m - r)* (m - r + 1) / 2);
            else
                rSum = (m*(m+1) / 2) + 1 * (r - m);
            
            if(l <= m)
                lSum = (m*(m+1) / 2) - ((m - l)* (m - l + 1) / 2);
            else
                lSum = (m*(m+1) / 2) + 1 * (l - m);
            
            sum += lSum + rSum;
            if(sum <= maxSum){
                res = mid;
                start = mid + 1;
            }else
                end = mid - 1;
        }
        return (int)res;
    }
}