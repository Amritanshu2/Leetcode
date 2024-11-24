class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0; 
        int negativeCount = 0; 
        int minAbsValue = Integer.MAX_VALUE; 

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int val = matrix[i][j];
                sum += Math.abs(val); 
                if (val < 0) negativeCount++; 
                minAbsValue = Math.min(minAbsValue, Math.abs(val));
            }
        }

        
        if (negativeCount % 2 != 0) {
            sum -= 2 * minAbsValue;
        }

        return sum;
    }
}
