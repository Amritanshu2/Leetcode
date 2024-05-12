class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][]arr = new int[grid.length-2][grid[0].length-2];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                int a = grid[i][j];
                for(int i1 = 0;i1<3;i1++){
                    for(int j1 = 0; j1<3; j1++){
                        a = Math.max(a,grid[i+i1][j+j1]);
                    }
                }
                arr[i][j] = a;
            }
        }
        return arr;
    }
}