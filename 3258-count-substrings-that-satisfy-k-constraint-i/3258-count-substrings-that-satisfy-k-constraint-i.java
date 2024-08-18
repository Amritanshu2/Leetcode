class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int num = 0;
        
        for(int i = 0;i<s.length();i++){
            int num0 = 0,num1 = 0;
            for(int j = i;j<s.length();j++){
                if(s.charAt(j) == '1'){num1++;}
                if(s.charAt(j) == '0'){num0++;}
                if(num1 <= k || num0 <= k){num++;}
                else{break;}
            }
        }
        return num;
    }
}