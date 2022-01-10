class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //Using the advantage of length of Array ie 1000
        int i=0;
        int[] freq=new int[1001];
        for(int x:nums1){
            freq[x]++;
        }
        
        List<Integer> l=new ArrayList<>();
        for(int x: nums2){
            if(freq[x] >0){
                l.add(x);
                freq[x]=0;
            }
        }
        int[] ar=new int[l.size()];
        for(Integer x: l)
            ar[i++]=x;
        return ar;
    }
}