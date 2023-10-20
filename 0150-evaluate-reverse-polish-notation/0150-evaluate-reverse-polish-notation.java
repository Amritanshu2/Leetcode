class Solution {
    public int evalRPN(String[] to) {
        Stack<Integer>st = new Stack<>();
        for(int i = 0;i<to.length;i++){
            if(to[i].charAt(0)=='/'){
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
            }
            else if(to[i].charAt(0)=='*'){
                int a = st.pop();
                int b = st.pop();
                st.push(b*a);
            }
            else if(to[i].charAt(0)=='+'){
                int a = st.pop();
                int b = st.pop();
                st.push(b+a);
            }
            // else if(to[i].charAt(0)=='-'){
            //     int a = st.pop();
            //     int b = st.pop();
            //     st.push(b/a);
            // }
            else if(to[i].charAt(0)=='-' && to[i].length()==1){
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);
            }
            else{
                st.push(Integer.parseInt(to[i]));
            }
        }
        return st.peek();
    }
}