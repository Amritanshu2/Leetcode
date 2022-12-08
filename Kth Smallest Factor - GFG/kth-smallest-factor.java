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
            String S[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(S[0]);
            int K = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.kThSmallestFactor(N,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int kThSmallestFactor(int n , int k) {
        int [] arr = new int [k+1];
        int m = 0,j=1;
        Arrays.fill(arr, 0);
        while(m<=k && j<=n){
            if(n%j==0){
                arr[m] = j;j++;
                m++;
            }
            else{
                j++;
            }
        }
        if(arr[k-1]!=0){return arr[k-1];}
        return -1;
    }
};