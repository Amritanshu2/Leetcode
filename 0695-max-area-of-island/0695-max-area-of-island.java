class Solution {
    int[][] arr;int max = 0;
    public int maxAreaOfIsland(int[][] grid) {
        
        arr = new int [grid.length][grid[0].length]; 
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                arr[i][j] = -1;
            }
        }
        
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1 && arr[i][j] == -1){
                    max = Math.max(check(grid, i ,j),max);
                }
            }
        }
        return max;
    }
    
    public int check(int[][]grid,int i,int j){
        if(i < 0 || j < 0 || i>=grid.length || j>=grid[0].length || grid[i][j] == 0 || arr[i][j] == 0){return 0;}
        arr[i][j] = 0;
        int rgt = check(grid,i+1,j) + check(grid,i-1,j);
        
        int down = check(grid,i,j+1) + check(grid,i,j-1);
        return rgt+down+1;
    }
}