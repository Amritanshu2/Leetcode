//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.singleElement(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int singleElement(int[] nums , int N) {
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        for(int i = 0; i<nums.length-1; i++){
            if(i==0 && nums[i] != nums[i+1]){
                return nums[i];
            }
            else if(i!= 0 && nums[i-1] != nums[i] && nums[i] != nums[i+1]){
                return nums[i];
            }
            
              
            
        }
        if(nums[nums.length-1] != nums[nums.length-2]){
            return nums[nums.length-1];
        }
        return 0;
    }
}

