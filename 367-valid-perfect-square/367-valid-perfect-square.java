class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 2)
            return true;
        
        int start = 1;
        int end = num;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            float check = num/(float)mid;
            if(mid == check)
                return true;
            else if(mid <= check){
                start = mid + 1;
            }else
                end = mid - 1;
        }
        return false;
    }
}