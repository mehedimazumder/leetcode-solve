class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < row; i++){
            int lowMinIdx = 0;
            
            for(int j = 1; j < col; j++){
                if(matrix[i][j] < matrix[i][lowMinIdx]){
                    lowMinIdx = j;
                }
            }
            
            int colMaxIdx = 0;
            for(int k = 1; k < row; k++){
                if(matrix[k][lowMinIdx] > matrix[colMaxIdx][lowMinIdx]){
                    colMaxIdx = k;
                }
            }
            
            if(matrix[i][lowMinIdx] == matrix[colMaxIdx][lowMinIdx])
                res.add(matrix[i][lowMinIdx]);
                
        }
        return res;
    }
}