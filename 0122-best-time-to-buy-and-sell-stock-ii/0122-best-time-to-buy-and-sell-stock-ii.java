class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for(int i = 0; i < prices.length; i++){
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        return helper(prices,0,1,dp);
        
        
    }
    // the main agenda here is that if I am buing a stock on a ith day then i can only buy a stock on another day if i already sold it. let's say i am buying a stock 0th day thenn untill i sell it i can not buy another one. So variable buy is here.'
    public int helper(int[] prices, int index, int buy,int[][] dp){
        if(index == prices.length) return 0;
        if(dp[index][buy] != -1) return dp[index][buy];
        int profit = 0;
        if(buy == 1){
            //Here, you are either buying on that day or skipping on thet day and yoy need to find maximum of them,
            //if you are buying then profit = selling - buying price right. so each time you buy your value becomes negative.
            int buying = -prices[index] + helper(prices, index+1,0,dp);
            int skipping = helper(prices, index+1,1,dp);
            profit = Math.max(buying, skipping);

            
        } else{
            // same goes for selling 
            int selling = prices[index] + helper(prices, index+1, 1,dp);
            int skipping = helper(prices, index+1,0,dp);
            profit = Math.max(selling, skipping);

        }
        dp[index][buy] = profit;
        return dp[index][buy];
    }
}