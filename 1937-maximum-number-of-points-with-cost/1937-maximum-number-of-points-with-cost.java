class Solution {

    long[][] dp;

    public long maxPoints(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        dp = new long[points.length][points[0].length];
        check(points);
        long max = 0;  
        for (int i = 0; i < dp[0].length; i++) {
            max = Math.max(max, dp[0][i]);
        }

        return max;
    }

    public void check(int[][] points) {

        for (int i = points.length - 1; i >= 0; i--) {
            for (int j = 0; j < points[0].length; j++) {
                if (i == points.length - 1) {
                    dp[i][j] = points[i][j];
                    continue;
                }
                long a = 0;
                for(int k = 0;k<dp[0].length;k++){
                    a = Math.max(a,dp[i+1][k]+points[i][j]-Math.abs(k-j));
                }
                dp[i][j] = a;
                
            }
        }
    }

}


