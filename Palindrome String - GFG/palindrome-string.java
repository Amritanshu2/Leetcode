//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n = s.length();
            for(int i=0; i<n/2; i++) {
            
            if(s.charAt(i) != s.charAt(n-1-i)) {
                return 0;
            }
        }
       return 1;
    }
};