class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols =  grid[0].length;
        int row = 0;
        int col = cols - 1;
        
        int totalNegetives = 0;
        
        while(row < rows && col >= 0){
            if(grid[row][col] < 0){
                totalNegetives += rows - row;
                col--;
            }else
                row++;
        }
        return totalNegetives;
    }
}