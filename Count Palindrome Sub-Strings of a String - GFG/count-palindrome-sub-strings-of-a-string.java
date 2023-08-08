//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int N=sc.nextInt();
                    String S=sc.next();
                        
                    Solution obj = new Solution();
                    
                    
                    System.out.println(obj.CountPS(S,N));
                    
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public int pali(String s,int a){
        // System.out.println(s);
        int i = 0;int j=s.length()-1;
        // if(j-i==1){return a;}
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return a;
            }
            i++;j--;
        }
        a++;
        return a;
    }
    
    
    public int CountPS(String S, int N)
    {
        int ans = 0;
        for(int i = 0;i<S.length()-1;i++){
            for(int j = i+2;j<=S.length();j++){
                ans = pali(S.substring(i,j),ans);
            }
        }
        return ans;
     
    }
}