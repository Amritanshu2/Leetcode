class Solution {
    int[][] ar;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1){return 0;}
        ar = new int[m][n];
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = -1; 
            }
        }
        return path(obstacleGrid,0,0);
    }
    
    public int path(int [][]arr ,int i, int j){
        if(i == arr.length-1 && j == arr[0].length-1 && arr[i][j]!= 1){return 1;}
        if(i == arr.length-1 && j == arr[0].length-1 && arr[i][j]== 1){return 0;}
        if(ar[i][j]!=-1){return ar[i][j];}
        if(i != arr.length-1 && j != arr[0].length-1 && arr[i+1][j]!=1 && arr[i][j+1]!=1){
            int a = path(arr,i+1,j);
            int b = path(arr,i,j+1);
            return ar[i][j] = a+b;
        }
        if(i != arr.length-1 && j != arr[0].length-1 && arr[i+1][j]==1 && arr[i][j+1]!=1){
            // int a = path(arr,i+1,j);
            int b = path(arr,i,j+1);
            return ar[i][j] = b;
        }
        if(i != arr.length-1 && j != arr[0].length-1 && arr[i+1][j]!=1 && arr[i][j+1]==1){
            int a = path(arr,i+1,j);
            // int b = path(arr,i,j+1);
            return ar[i][j] = a;
        }
        if(i != arr.length-1 && j == arr[0].length-1 && arr[i+1][j]!=1){
            int a = path(arr,i+1,j);
            
            return ar[i][j] = a;
        }
        if(i == arr.length-1 && j != arr[0].length-1  && arr[i][j+1]!=1){
            
            int b = path(arr,i,j+1);
            return ar[i][j] = b;
        }
        return ar[i][j] = 0;
    }
    
}