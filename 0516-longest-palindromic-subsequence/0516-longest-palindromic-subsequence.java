class Solution {
    public int longestPalindromeSubseq(String s) {
        String S = reverseString(s);
        return longestCommonSubsequence(s,S);
    }
     public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    
    public int longestCommonSubsequence(String text1, String text2) {
        int len1=text1.length();
        int len2=text2.length();
        char ch1[]=text1.toCharArray();
        char ch2[]=text2.toCharArray();

        int dp[][]=new int[len1][len2];
        
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }

        return solve(ch1,ch2,dp,len1-1,len2-1);
    }
    public int solve(char ch1[],char ch2[],int dp[][],int index1,int index2){
    //base case
    if(index1<0 || index2<0)return 0;
    
    //Dp
    if(dp[index1][index2]!=-1)return dp[index1][index2];

    //match 
    if(ch1[index1]==ch2[index2]){
        dp[index1][index2]=1+solve(ch1,ch2,dp,index1-1,index2-1);
    }
    //not match
    else{
        //not considering from ch1
        int nt1=solve(ch1,ch2,dp,index1-1,index2);
        //not considering from ch2
        int nt2=solve(ch1,ch2,dp,index1,index2-1);

        //find max in (nt1,nt2) then assign it to dp[index1][index2];
        dp[index1][index2]=Math.max(nt1,nt2);
    }

    return dp[index1][index2];
    }
}