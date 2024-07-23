class Solution {
    public int minChanges(int n, int k) {
        if(k>n){
            return -1;
        }
        int count = 0;
        StringBuilder strn = new StringBuilder(Integer.toBinaryString(n));
        StringBuilder strk = new StringBuilder(Integer.toBinaryString(k));
        int i=strn.length()-1,j=strk.length()-1;
        while(i>=0 && j>=0){
            if(strn.charAt(i)==strk.charAt(j)){
                i--;j--;
            }
            else if(strn.charAt(i)=='1' && strk.charAt(j)=='0'){
                count++;
                i--;j--;
            }
            else{
                return -1;
            }
        }
        while(i>=0){
            if(strn.charAt(i)=='1'){
                count++;
            }
            i--;
        }
        return count;
    }
}