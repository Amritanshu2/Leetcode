//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends



class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int p[], int n)
    {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<p.length;i++){
            int hmm = 1;
            if(st.empty()){st.push(p[i]);hm.put(p[i],hmm);p[i] = hmm;}
            else{
                while(st.empty()!= true && st.peek()<=p[i]){
                    hmm = hmm + hm.get(st.peek());
                    st.pop();
                }
                st.push(p[i]);
                hm.put(p[i],hmm);
                p[i] = hmm;
            }
        }
        return p;
        
    }
    
}