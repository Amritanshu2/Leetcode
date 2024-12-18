class Solution {
    int dp[];
    public int maxRepeating(String seq, String word) {
        int max = 0;
        dp = new int[seq.length()+1];
        for(int i = 0;i<seq.length();i++){
            max = Math.max(max,check(i,seq,word));
        }
        return max;
    }

    public int check(int i, String s, String ans){
        if(dp[i] != 0){return dp[i];}
        if(i + ans.length() <= s.length() && s.substring(i,i+ans.length()).equals(ans)){
            return dp[i] = 1 + check(i+ans.length(),s,ans);
        }
        return 0;
    }
}