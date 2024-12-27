class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int[]dp = new int[values.length];
        int max = 0;
        for(int i = values.length-1;i>=0;i--){
            if(i == values.length-1){dp[i] = values[dp.length-1];continue;}
            dp[i] = Math.max(values[i+1]+values[i]-1,dp[i+1]+values[i]-values[i+1]-1);
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}