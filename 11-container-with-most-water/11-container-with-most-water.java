class Solution {
    public int maxArea(int[] height) {
        // O(N)
        int left = 0;
        int right = height.length - 1;
        int amount = 0;
        
        while(left < right){
            int h = Math.min(height[left], height[right]);
            int container = h * (right - left);
            amount = Math.max(amount, container);
            
            if(height[left] > height[right])
                right--;
            else
                left++;
        }
        return amount;
    }
}