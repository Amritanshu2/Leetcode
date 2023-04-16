class Solution {
    public int countDigits(int num) {
        int m =0;int k = num;
        while(num>0){
            if(k % (num%10)==0){
                m+=1;
            }
            num = num/10;
        }
        return m;
    }
}