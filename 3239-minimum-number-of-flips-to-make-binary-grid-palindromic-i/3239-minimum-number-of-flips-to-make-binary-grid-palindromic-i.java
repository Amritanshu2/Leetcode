class Solution {
    public int minFlips(int[][] grid) {
        if(grid.length <= 1 || grid[0].length <= 1) return 0;
        int a = checkr(grid);
        int b = checkc(grid);
        return Math.min(a,b);
    }
    
    public int checkr(int[][]grid){
        int a = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length/2;j++){
                if(grid[i][j] != grid[i][grid[0].length-1-j]){a++;}
            }
        }
        return a;
    }
    
    public int checkc(int[][]grid){
        int a = 0;
        for(int i = 0;i<grid[0].length;i++){
            for(int j = 0;j<grid.length/2;j++){
                if(grid[j][i] != grid[grid.length-1-j][i]){a++;}
            }
        }
        return a;
    }
}