class Solution {
    int max;
    public int maxProfit(int k, int[] prices) {
        this.max = k;
        int dp[][] = new int[prices.length][k];
        for(int i = 0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return hlpr(prices,0,0,0,false,dp);
    }
    
    public int hlpr(int[]arr, int i, int tot,int buy,boolean sell, int[][] dp){
        if(i == arr.length){return 0;}
        if(tot >= max){return 0;}
        
        if(sell == false){
            if(dp[i][tot] != -1){return dp[i][tot];}
            int a = hlpr(arr,i+1,tot,0,false,dp);
            a = Math.max(a, hlpr(arr,i+1,tot,arr[i],true,dp));
            return dp[i][tot] = a;
        }
        else{
            int a = arr[i]-buy + hlpr(arr,i+1,tot+1,0,false,dp);
            a = Math.max(a, hlpr(arr,i+1,tot,buy,true,dp));
            return a;
        }
    }
} 