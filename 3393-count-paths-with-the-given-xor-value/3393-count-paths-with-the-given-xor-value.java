class Solution {
    int helper(int i, int j, int xr, int n, int m, int[][] grid, int k, int[][][] dp){
        if(i >= n || j >= m) return 0;
        xr ^= grid[i][j];
        if(i == n - 1 & j == m - 1){
            if(xr == k) return 1;
            return 0;
        }
        if(dp[i][j][xr] != -1) return dp[i][j][xr];
        return dp[i][j][xr] = (helper(i + 1, j, xr, n, m, grid, k, dp) % 1000000007 + helper(i, j + 1, xr, n, m, grid, k, dp) % 1000000007) % 1000000007;
    }
    public int countPathsWithXorValue(int[][] grid, int k) {
        int[][][] dp = new int[grid.length][grid[0].length][16];
        for(int[][] dd : dp) for(int[] d : dd) Arrays.fill(d, -1);
        return helper(0, 0, 0, grid.length, grid[0].length, grid, k, dp);
    }
}
    
    