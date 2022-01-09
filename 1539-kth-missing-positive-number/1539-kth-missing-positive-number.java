class Solution {
    public int findKthPositive(int[] arr, int k) {
        if (k<arr[0])
            return k;
        int mid,low=0,high=arr.length;
        while (low<high)
        {
            mid=low+(high-low)/2;
            if (arr[mid]-mid-1<k)
                low=mid+1;
            else high=mid;
        }
        return low+k;

    }
}