class Solution {
    public String reverseWords(String s) {
        int n = 0;String ans = "";
        while(n<s.length()){
            String sd = "";
            while( n < s.length() && s.charAt(n)!=' '){
                sd = s.charAt(n) + sd;
                n++;
            }
            ans = ans +sd;
            if(s.length()>n){ans = ans + ' ';n++;}
           
        }
        return ans;
    }
}
    