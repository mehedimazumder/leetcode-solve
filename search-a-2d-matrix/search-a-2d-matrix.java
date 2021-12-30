class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int rowLen = matrix[0].length;
        int end = (matrix.length * (rowLen)) - 1;
        
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            int rowIdx = mid / rowLen;
            int colIdx = mid % rowLen;
            
            if(matrix[rowIdx][colIdx] == target)
                return true;
            
            if(matrix[rowIdx][colIdx] < target)
                start = mid + 1;
            else
                end = mid - 1;
            
        }
        return false;
    }
}