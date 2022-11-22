class Solution {
    public int minPathSum(int[][] arr) {
        int m = arr.length;// row
	    int n = arr[0].length; // column
        int[][] dp = new int[m][n];
        for(int i = m-1;i>=0;i--){
            for(int j = n-1;j>=0;j--){
               if(i==m-1 && j ==n-1){
                   dp[i][j] = arr[i][j];
               } 
               else if(i==m-1){
                   dp[i][j] = dp[i][j+1] + arr[i][j];
               }
               else if(j==n-1){
                   dp[i][j] = dp[i+1][j] + arr[i][j];
               }
               else{
                   int min = Math.min(dp[i+1][j],dp[i][j+1]);
                   dp[i][j] = min + arr[i][j];
               }
            }
            
        }
        return dp[0][0];
    }
}