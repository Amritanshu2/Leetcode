class Solution {
    public int passThePillow(int n, int time) {
        int k = 1;int j = 0,m=1;
        while(k<=time){
            if(j%2==0){
                while(m<n && k <= time){
                    m++;k++;
                }
                j++;
            }
            else{
                while(m>1 && k <= time){
                    m--;k++;
                }
                j++;
            }
        }
        return m;
    }
}