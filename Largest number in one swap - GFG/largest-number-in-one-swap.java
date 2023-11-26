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
            String N = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.LargestSwap(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String LargestSwap(String S){
        char[] arr = S.toCharArray();
        for(int i = 0;i<S.length();i++){
            int s = Character.getNumericValue(S.charAt(i));;
            int max = 0;
            for(int j = S.length()-1;j>i;j--){
                int d = Character.getNumericValue(S.charAt(j));
                if(d > s){s = d;max = j;}
            }
            if(max!=0){
                char c = arr[i];
                arr[i] = arr[max];
                arr[max] = c;
                String myString = new String(arr);
                return myString;
            }
        }
        return S;
    }
}