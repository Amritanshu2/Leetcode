class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;
        int[][] arr = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Math.min(rowSum[i], colSum[j]);
                rowSum[i] -= arr[i][j];
                colSum[j] -= arr[i][j];
            }
        }
        
        return arr;
    }
}
