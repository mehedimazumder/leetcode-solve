class Solution {
    public int longestOnes(int[] nums, int K) {
        int zeroCount=0,start=0,res=0;
        for(int end=0;end<nums.length;end++){
            if(nums[end] == 0) zeroCount++;
            while(zeroCount > K){
                if(nums[start] == 0) zeroCount--;
                start++;
            }
            res=Math.max(res,end-start+1);
        }
        return res;
    }
}