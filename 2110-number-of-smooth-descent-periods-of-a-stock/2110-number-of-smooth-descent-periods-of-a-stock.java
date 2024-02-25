class Solution {
    public long getDescentPeriods(int[] prices) {
        
        int i = 0;int j = 0;long total = 0;
        while(i<=j && j<prices.length){
            if(j>0  && prices[j-1]-prices[j] != 1){
                i = j;
            }
            total += j-i+1;
            j++;
        }
        return total;
    }
}