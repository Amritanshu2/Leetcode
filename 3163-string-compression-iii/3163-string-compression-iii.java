class Solution {
    public String compressedString(String s) {
        String as = "";char prev = ' ';int num = 0;
        for(int i = 0;i<=s.length();i++){
            if(prev == ' '){
                prev = s.charAt(i);num++;continue;
            }
            
            if(i == s.length() || prev != s.charAt(i)){
                if(num>9){
                    while(num>9){
                        as = as + 9 + prev;
                        num -= 9;
                    }
                    if(num>0)as = as + num + prev;
                }
                else{as = as + num + prev;}num = 1;
                if(i!=s.length()){prev = s.charAt(i);}continue;
            }
            
            if(s.charAt(i) == prev){num++;continue;}
        }
        return as;
    }
}