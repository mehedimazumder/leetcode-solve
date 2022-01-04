class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length == 1 && digits[0] == 9)
            return new int[] {1,0};
        boolean allNines = true;
        for(int i = 0; i < digits.length; i++){
            if(digits[i] < 9){
                allNines = false;
                break;                
            }
        }
        
        if(allNines){
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            return ans;
        }
        
        for(int i = digits.length - 1; i>= 0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
                continue;
            }else{
                digits[i]++;
                break;
            }
        }
        return digits;
    }
}