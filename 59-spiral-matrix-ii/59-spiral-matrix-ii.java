class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        int left = 0, right = n - 1, top = 0, bottom = n - 1; 
        
        int number = 1;
        
        while(top <= bottom && left <= right){    
            for(int i = left; i <= right; i++){
                matrix[top][i] = number;
                number++;
            }
            top++;
            
            for(int i = top; i <= bottom; i++){
                matrix[i][right] = number;
                number++;
            }
            right--;
            
            // check if last one row done, then exit here  
            if(top > bottom || left > right)
                break;
            
            for(int i = right; i >= left; i--){
                matrix[bottom][i] = number;
                number++;
            }
            bottom--;
            
            for(int i = bottom; i >= top; i--){
                matrix[i][left] = number;
                number++;
            }
            left++;
            
            if(Math.sqrt(number) == number)
                break;
            
        }
        
        return matrix;
    }
}