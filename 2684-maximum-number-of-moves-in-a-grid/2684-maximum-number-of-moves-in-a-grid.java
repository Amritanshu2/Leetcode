class Solution {
    
    int[][]dp;
    public int maxMoves(int[][] grid) {
        int max = -(int)1e8;
        dp = new int[grid.length][grid[0].length];
        for(int i = 0;i<grid.length;i++){
            max = Math.max(maxm(grid,i,0),max);
        }
        return max-1;
    }
    
    public int maxm(int[][]grid, int i, int j){
        
        int a = 0;
        if(dp[i][j] != 0){return 0;}
        if(j<grid[0].length-1 && grid[i][j+1] > grid[i][j])a = maxm(grid,i,j+1);
        if(j<grid[0].length-1 && i>0 && grid[i-1][j+1] >grid[i][j]){
            a = Math.max(a,maxm(grid,i-1,j+1));
        }
        if(j<grid[0].length-1 && i<grid.length-1 && grid[i+1][j+1] >grid[i][j]){
            a = Math.max(a,maxm(grid,i+1,j+1));
        }
        return dp[i][j] = a+1;
    }
}