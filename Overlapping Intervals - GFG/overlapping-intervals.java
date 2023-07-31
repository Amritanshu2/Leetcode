//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] in)
    {
        // Code here // Code here
        Stack<int[]>st = new Stack<>();
        Arrays.sort(in,(a,b)->{
            return a[0]-b[0];
        });
        st.push(in[0]);
        for(int i = 1;i<in.length;i++){
               int[]arr = st.pop();
               int s1 = arr[0];
               int e1 = arr[1];
               
               int s2 = in[i][0];
               int e2 = in[i][1];
               
               if(s2<=e1){
                   int em = Math.max(e1,e2);
                   int[]ans = {s1,em};
                   st.push(ans);
               }
               else{
                   st.push(arr);
                   st.push(in[i]);
               }
               
        }
        
        int [][] arr = new int[st.size()][2];
        for(int i = st.size()-1;i>=0;i--){
            arr[i] = st.pop();
        }
        return arr;
    }
}