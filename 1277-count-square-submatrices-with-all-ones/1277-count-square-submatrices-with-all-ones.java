class Solution {
    
    public class idx {
        int size;
        
        idx(int size) {
            this.size = size;
        }
    }
    
    public int countSquares(int[][] matrix) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;
        
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                
                if (matrix[i][j] == 0) {
                    matrix[i][j] = 0;
                    continue;
                }
                
                if (i < rows - 1 && j < cols - 1) {
                    matrix[i][j] = Math.min(Math.min(matrix[i + 1][j], matrix[i][j + 1]), matrix[i + 1][j + 1]) + 1;
                } else {
                    matrix[i][j] = 1;
                }
                
                count += matrix[i][j];
            }
        }
        
        return count;
    }
}
