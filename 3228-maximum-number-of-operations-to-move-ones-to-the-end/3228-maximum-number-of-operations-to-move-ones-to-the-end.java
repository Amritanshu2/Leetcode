class Solution {
    public int maxOperations(String s) {
        int n0 = 0; int n1 = 0;int step = 0;
        for(int i = 0;i<=s.length();i++){
            if(i == s.length()){
                if(n1 != 0 && n0 != 0){
                    step += n1;
                }
                break;
            }
            if(s.charAt(i) == '0'){n0++;}
            if(s.charAt(i) == '1'){
                
                if(n1 != 0 && n0 != 0){
                    step += n1;
                }
                n0=0;n1++;
            }
        }
        return step;
    }
}