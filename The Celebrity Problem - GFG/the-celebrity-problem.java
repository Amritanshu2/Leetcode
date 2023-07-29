//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int m[][], int n)
    {
    	Stack<Integer> st = new Stack<>();
    	for(int i = 0;i<n;i++){
    	    st.push(i);
    	}
    	while(st.size()>=2){
    	    if(st.size()==2){
    	        int n1 = st.pop();
    	        int n2 = st.pop();
    	        if(m[n1][n2]==0  && m[n2][n1]!=0 ){
    	            for(int h = 0;h<n;h++){
    	                if(m[n1][h]==1){
    	                    return -1;
    	                }
    	            }
    	           // for(int h = 0;h<n;h++){
    	           //     if(m[h][n1]==1){
    	           //         return -1;
    	           //     }
    	           // }
    	            return n1;
    	        }
    	        else if(m[n2][n1]==0 && m[n1][n2]!=0){ 
    	            
    	            for(int h = 0;h<n;h++){
    	                if(m[n2][h]==1){
    	                    return -1;
    	                }
    	            }
    	           // for(int h = 0;h<n;h++){
    	           //     if(m[h][n2]==1){
    	           //         return -1;
    	           //     }
    	           // }
    	            
    	            return n2;}
    	        else {return -1;}
    	    }
    	    
    	    int n1 = st.pop();
    	    int n2 = st.pop();
    	    if(m[n1][n2]==0){st.push(n1);}
    	    else if(m[n2][n1]==0){st.push(n2);}
    	    
    	}
    	return -1;
    }
}