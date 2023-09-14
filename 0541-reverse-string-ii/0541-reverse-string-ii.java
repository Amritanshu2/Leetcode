class Solution {
    public String reverseStr(String s, int k) {
         int n = 0;String ans = "";
        while(n<s.length()){
            String sd = "";int i = 0;
            while(i<k && n<s.length()){
                sd = s.charAt(n) + sd;
                n++;i++;
            }i=0;
            while(i<k && n<s.length()){
                sd =  sd + s.charAt(n);
                n++;i++;
            }
            ans = ans +sd;
        }
        return ans;
    }
}