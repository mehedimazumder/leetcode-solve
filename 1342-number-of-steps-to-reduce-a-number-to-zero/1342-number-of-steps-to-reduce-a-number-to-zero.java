class Solution {
    public int numberOfSteps(int num) {
        return numToZero(num, 0);
    }
    
    public int numToZero(int n, int c){
        if(n == 0)
            return c;
        
        if(n % 2 == 0)
            n = n / 2;
        else
            n = n - 1;
        
        return numToZero(n, c+1);
    }
}