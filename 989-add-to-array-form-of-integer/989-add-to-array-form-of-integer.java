class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int len = num.length;
        int cur = k;
        
        List<Integer> ans = new ArrayList<>();
        
        while(--len >= 0 || cur > 0){
            if(len >= 0)
                cur += num[len];
            ans.add(cur % 10);
            cur /= 10;
        }
        
        Collections.reverse(ans);
        return ans;
    }
}