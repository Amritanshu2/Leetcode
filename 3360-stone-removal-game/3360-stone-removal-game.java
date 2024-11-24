class Solution {
    public boolean canAliceWin(int n) {
        int a = 10;
        while(n>0){
            n-=a;
            if(a %2 == 0 && n <0){return false;}
            else if(a%2 != 0 && n <0){return true;}
            a--;
            
        }
        return a%2 == 0? false:true;
    }
}