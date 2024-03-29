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
        Stack<int[]> st = new Stack<>();
        Arrays.sort(in,(a,b)->{
            return a[0]-b[0];
        });
        st.push(in[0]);
        for(int i = 1;i<in.length;i++){
            int[]t = st.pop();
            int s1 = t[0];
            int e1 = t[1];
            
            int s2 = in[i][0];
            int e2 = in[i][1];
            int em = Math.max(e1,e2);
            
            if(s2<=e1){
                int[] merge ={s1,em};
                st.push(merge);
            }
            
            else{
                st.push(t);
                st.push(in[i]);
            }
            
        }
        int[][]ans = new int[st.size()][2];
        for(int i = ans.length-1;i>=0;i--){
            int[]tm = st.pop();
            ans[i][0] = tm[0];
            ans[i][1] = tm[1];
        }
        return ans;
    }
}