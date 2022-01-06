class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1; 
        
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            
            for(int i = top; i <= bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            
            if(top > bottom || left > right)
                break;
            
            for(int i = right; i >= left; i--){
                ans.add(matrix[bottom][i]);
            }
            bottom--;
            
            for(int i = bottom; i >= top; i--){
                ans.add(matrix[i][left]);
            }
            left++;
        }
        
        return ans;
    }
}