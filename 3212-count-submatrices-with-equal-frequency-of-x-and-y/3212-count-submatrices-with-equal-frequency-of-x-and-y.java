class Solution {

    public class Cache {
        int sum = 0;
        int con = 0;
        
        Cache(int sum, int con) {
            this.sum = sum;
            this.con = con;
        }
    }

    public int numberOfSubmatrices(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Cache[][] cache = new Cache[rows][cols];

        // Fill cache with sum and con values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sum = 0, con = 0;
                
                if (grid[i][j] == 'X') {
                    sum = 1;
                    con = 1;
                } else if (grid[i][j] == 'Y') {
                    sum = -1;
                }

                if (i > 0) {
                    sum += cache[i-1][j].sum;
                    con += cache[i-1][j].con;
                }

                if (j > 0) {
                    sum += cache[i][j-1].sum;
                    con += cache[i][j-1].con;
                }

                if (i > 0 && j > 0) {
                    sum -= cache[i-1][j-1].sum;
                    con -= cache[i-1][j-1].con;
                }

                cache[i][j] = new Cache(sum, con);
            }
        }

        // Count valid submatrices
        int total = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (cache[i][j].sum == 0 && cache[i][j].con > 0) {
                    total++;
                }
            }
        }

        return total;
    }
}
