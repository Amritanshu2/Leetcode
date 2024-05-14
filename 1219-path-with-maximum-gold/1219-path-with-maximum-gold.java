class Solution {
    
    public int hlpr(int i, int j, int[][] grid, int[][] vis) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || vis[i][j] == 1) {
            return 0;
        }
        
        vis[i][j] = 1;
        
        int a = hlpr(i + 1, j, grid, vis);
        int b = hlpr(i - 1, j, grid, vis);
        int c = hlpr(i, j - 1, grid, vis);
        int d = hlpr(i, j + 1, grid, vis);
        
        vis[i][j] = 0;
        
        return grid[i][j] + Math.max(a, Math.max(b, Math.max(c, d)));
    }
    
    public int getMaximumGold(int[][] grid) {
        int max = 0;
        int m = grid.length;
        int n = grid[0].length;
        
        int[][] vis = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, hlpr(i, j, grid, vis));
            }
        }
        return max;
    }
}
