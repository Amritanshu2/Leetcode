class Solution {
    public String losingPlayer(int x, int y) {
        int a = 0;
        while(x>=1 && y>=4){
            x-=1;y-=4;a++;
        }
        return a%2!=0?"Alice":"Bob";
    }
}