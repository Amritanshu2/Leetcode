class Solution {
    public int climbStairs(int n) {
        int[]dp = new int[n+1];
        
        return climbStairsM(n,dp);
    }
    public static int climbStairsM(int n, int [] dp){
        if(n == 0){
            return dp[n] = 1;
        }
        
        if(dp[n] != 0)
            return dp[n];
        
        
        int count = 0;
        
        if(n-1 >= 0){
            count += climbStairsM(n-1, dp);
        }
        if(n-2 >= 0){
            count += climbStairsM(n-2, dp);
        }
       
        return dp[n] = count;
        
    }
}