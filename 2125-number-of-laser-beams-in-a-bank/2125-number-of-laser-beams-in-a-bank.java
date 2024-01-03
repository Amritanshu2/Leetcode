class Solution {
    public int numberOfBeams(String[] bank) {
        int a = 0,total = 0;
        int b = 0;
        for(int i = 0;i<bank.length ;i++){
            if(a == 0){
                for(int j = 0;j<bank[i].length();j++){
                
                    if(bank[i].charAt(j)=='1'){a++;}
                }
            }
            else{
                for(int j = 0;j<bank[i].length();j++){
                
                    if(bank[i].charAt(j)=='1'){b++;}
                }
            }
            if(b!=0){total += a*b;a=b;b=0;}
        }
        return total;
    }
}