class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int emptyBottles = numBottles;
        numBottles = emptyBottles/numExchange;
        emptyBottles -= numBottles*numExchange;
        while(numBottles>0){
            ans+= numBottles;
            emptyBottles += numBottles;
            numBottles = emptyBottles/numExchange;
            emptyBottles -= numBottles*numExchange;
        }
        return ans;
    }
}