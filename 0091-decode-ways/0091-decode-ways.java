class Solution {
    
    
    int[]dp;
    public int numDecodings(String s) {
        dp = new int[s.length()];
        if(s.charAt(0) == '0')return 0;
        return find(s,0);
    }
    
    public int find(String s, int a){
        if(a == s.length()){return 1;}
        if(s.charAt(a) == '0'){return 0;}
        if(dp[a]!=0){return dp[a];}
        int num = 0;
        if(a<s.length()-1){
            String as = ""+s.charAt(a)+s.charAt(a+1);
            int num1 = Integer.parseInt(as);
            if(num1<=26){
                num += find(s,a+2);
            }
        }
        num+=find(s,a+1);
        return dp[a] = num;
    }
}