class Solution {
    int a = 0;
    public int countCompleteDayPairs(int[] hours) {
        for(int i = 0;i<hours.length;i++){
            hlpr(hours,i);
        }
        return a;
    }
    
    public void hlpr(int[] hours,int src){
        for(int i = src+1;i<hours.length;i++){
            if((hours[i] + hours[src])%24 ==0){a++;}
        }
    }
}