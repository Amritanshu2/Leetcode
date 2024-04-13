class Solution {
    public int maximalSquare(char[][] matrix) {
        int max = 0;
        int[][]arr = new int[matrix.length][matrix[0].length];
        for(int i = matrix.length-1; i>=0 ; i--){
            for(int j = matrix[0].length-1; j>=0; j--){
                if(matrix[i][j]=='0'){arr[i][j] = 0;}
                else if(i == matrix.length-1 || j == matrix[0].length-1){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = Math.min(arr[i][j+1],Math.min(arr[i+1][j+1],arr[i+1][j]))+1;
                    
                }
                max = Math.max(max,arr[i][j]);
            }
        }
        return max*max;
    }
}