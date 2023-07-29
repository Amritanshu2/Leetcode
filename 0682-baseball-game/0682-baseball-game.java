class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<op.length;i++){
            if(op[i].charAt(0) == 'C' && st.empty()!=true){st.pop();}
            else if(op[i].charAt(0) == 'D' ){st.push(2*st.peek());}
            else if(op[i].charAt(0) =='+'){
                int v2 = st.pop();
                int v1 = st.pop();
                int v3 = v1+v2;
                st.push(v1);
                st.push(v2);
                st.push(v3);
            }
            else if(op[i].charAt(0) != 'C'){
                st.push(Integer.parseInt(op[i]));
            }
        }
        int ans = 0;
        while(st.empty()!=true){
            ans = ans + st.pop();
        }
        return ans;
    }
}