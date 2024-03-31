class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int bottleDrunk = 0;
        int EmptyBottle = 0;
        while(numBottles > 0 || EmptyBottle > numExchange){
            bottleDrunk += numBottles;
            EmptyBottle = EmptyBottle + numBottles;
            numBottles = 0;
            if(EmptyBottle >= numExchange){
                EmptyBottle -= numExchange;
                numExchange++;
                numBottles++;
                
            }
        }
        return bottleDrunk;
    }
}