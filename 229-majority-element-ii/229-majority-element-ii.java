class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = Integer.MIN_VALUE, c2 = Integer.MIN_VALUE, count1 = 0, count2 = 0;
        
        for(int num : nums){
            if(c1 == num)
                count1++;
            else if(c2 == num)
                count2++;
            else if(count1 == 0){
                c1 = num;
                count1 = 1;
            }else if(count2 == 0){
                c2 = num;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }
        
        var ans = new ArrayList<Integer>();
        int total1 = 0, total2 = 0;
        
        for(int num:nums){
            if(num == c1)
                total1++;
            if(num == c2)
                total2++;
        }
        
        if(total1 > nums.length / 3)
            ans.add(c1);
        if(total2 > nums.length / 3)
            ans.add(c2);
        
        return ans;
    }
}