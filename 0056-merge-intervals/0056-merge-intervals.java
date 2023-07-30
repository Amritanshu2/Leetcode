class Solution {
    public int[][] merge(int[][] in) {
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