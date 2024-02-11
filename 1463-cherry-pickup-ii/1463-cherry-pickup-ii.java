class Solution {
    
    int[][][]arr;
    public int cherryPickup(int[][] grid) {
        arr = new int[grid.length][grid[0].length][grid[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Arrays.fill(arr[i][j],-1);
            }
        }
        int a = collect(grid,0,0,grid[0].length-1);
        return a;
    }
    
    public int collect(int[][]grid,int i,int j,int k){
        if(i >= grid.length || j>=grid[0].length || j<0 || k>=grid[0].length || k<0){
            return 0;
        }
        if(arr[i][j][k]!=-1){return arr[i][j][k];}
        
        if(j==k){
            int a = 0,b = 0,c = 0;
            a = collect(grid,i+1,j+1,k)+grid[i][j];
            int a1 = collect(grid,i+1,j+1,k+1)+grid[i][j];
            int a2 = collect(grid,i+1,j+1,k-1)+grid[i][j];
            a = Math.max(a,Math.max(a1,a2));
            b = collect(grid,i+1,j-1,k)+grid[i][j];
            int b1 = collect(grid,i+1,j-1,k+1)+grid[i][j];
            int b2 = collect(grid,i+1,j-1,k-1)+grid[i][j];
            b = Math.max(b1,Math.max(b,b2));
            c = collect(grid,i+1,j,k)+grid[i][j];
            int c1 = collect(grid,i+1,j,k+1)+grid[i][j];
            int c2 = collect(grid,i+1,j,k-1)+grid[i][j];
            c = Math.max(c1,Math.max(c2,c));
            return arr[i][j][k] =  Math.max(a,Math.max(b,c));
        }
        int a = 0,b = 0,c = 0;
        a = collect(grid,i+1,j+1,k)+grid[i][j]+grid[i][k];
        int a1 = collect(grid,i+1,j+1,k+1)+grid[i][j]+grid[i][k];
        int a2 = collect(grid,i+1,j+1,k-1)+grid[i][j]+grid[i][k];
        a = Math.max(a,Math.max(a1,a2));
        b = collect(grid,i+1,j-1,k)+grid[i][j]+grid[i][k];
        int b1 = collect(grid,i+1,j-1,k+1)+grid[i][j]+grid[i][k];
        int b2 = collect(grid,i+1,j-1,k-1)+grid[i][j]+grid[i][k];
        b = Math.max(b1,Math.max(b,b2));
        c = collect(grid,i+1,j,k)+grid[i][j]+grid[i][k];
        int c1 = collect(grid,i+1,j,k+1)+grid[i][j]+grid[i][k];
        int c2 = collect(grid,i+1,j,k-1)+grid[i][j]+grid[i][k];
        c = Math.max(c1,Math.max(c2,c));
        return arr[i][j][k] = Math.max(a,Math.max(b,c));
    }
}