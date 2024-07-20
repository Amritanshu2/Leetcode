class Solution {
    int[][]arr;
    
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        arr= new int[rowSum.length][colSum.length];
        fillMatrix(rowSum,colSum,0,0);
        return arr;
    }
    
    public boolean fillMatrix(int[] rowSum, int[] colSum, int i, int j){
        if (i >= rowSum.length || j >= colSum.length) {
            return true;
        }

        int val = Math.min(rowSum[i], colSum[j]);
        arr[i][j] = val;
        rowSum[i] -= val;
        colSum[j] -= val;

        if (j == colSum.length - 1) {
            return fillMatrix(rowSum, colSum, i + 1, 0);
        } else {
            return fillMatrix(rowSum, colSum, i, j + 1);
        }
    }
}