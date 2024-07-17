class Solution {
    
    int dp[];
    public int coinChange(int[] coins, int amount) {
        dp = new int[amount+1];
        int a = min(coins,amount);
        return a==(int)1e8?-1:a;
    }
    
    public int min(int[]coins, int amt){
        
        
        
        if(amt == 0){return 0;}
        
        if(dp[amt]!=0){return dp[amt];}
        
        int a = (int)1e8;
        
        for(int i = 0;i<coins.length;i++){
            if(amt-coins[i]>=0)
                a = Math.min(a,min(coins,amt-coins[i])+1);
        }
        
        return dp[amt] = a;
    }
}