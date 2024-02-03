class Solution {
    
    int[]dp;
    
    public int maxSumAfterPartitioning(int[] arr, int k) {
        dp = new int[arr.length];
        Arrays.fill(dp,-1);
        return max(arr,0,k);
    }
    
    public int  max(int []arr,int low,int k){
        int m = -(int)1e8;
        if(low >= arr.length){
            return 0;
        }
         if(dp[low]!=-1){return dp[low];}
        int mc = 0;
        for(int i = low;i<low+k && i<arr.length;i++){
            
            // j +=  arr[i];
            mc  = Math.max(mc,arr[i]);
            m = Math.max(m,(max(arr,i+1,k)+(i-low+1)*mc));
        }
        return dp[low] = m;
        
    }
}