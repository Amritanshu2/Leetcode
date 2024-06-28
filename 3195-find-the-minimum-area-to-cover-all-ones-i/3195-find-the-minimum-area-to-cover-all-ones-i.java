class Solution {
    public int minimumArea(int[][] grid) {
        int sc = grid[0].length; int lc = 0;int sr = grid.length;int lr = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1){sc = Math.min(sc,i);lc = Math.max(lc,i);sr = Math.min(sr,j);lr = Math.max(lr,j);}
            }
        }
        
        return (lc+1-sc)*(lr-sr+1);
    }
}