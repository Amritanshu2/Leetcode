class Solution {
    public int pivotInteger(int n) {
        for(int i = 1;i<=n;i++){
            int s = 0;
            for(int j = i;j<=n;j++){
                s = s+j;
            }
            if(i*(i+1)/2 == s){return i;}
        }
        return -1;
    }
}