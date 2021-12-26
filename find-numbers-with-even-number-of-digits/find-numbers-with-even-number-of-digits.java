class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(isEven(num))
                ++count;
        }
        return count;
    }
    
    static boolean isEven(int num){
        return noOfDigits(num) % 2 == 0 ? true : false;
    }
    
    static int noOfDigits(int num){
        if(num < 0)
            num = num * -1;
        return (int)(Math.log10(num)) + 1;
    }
}