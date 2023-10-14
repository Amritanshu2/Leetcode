class Solution {
    public int[][] as(int[][]arr,int n,int m){
        for(int i = 0;i<arr[0].length;i++){
            arr[n][i] = 0;
        }
        for(int i = 0;i<arr.length;i++){
            arr[i][m] = 0;
        }
        return arr;
    }
    public void setZeroes(int[][] matrix) {
        int arr[][] = new int[matrix.length][matrix[0].length];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                arr[i][j] = matrix[i][j];
            }
        }
        
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    arr = as(arr,i,j);
                }
            }
        }
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                matrix[i][j] = arr[i][j];
            }
        }
        
    }
}