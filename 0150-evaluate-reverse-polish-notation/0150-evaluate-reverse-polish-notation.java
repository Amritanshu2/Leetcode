class Solution {
    public int evalRPN(String[] t) {
        
        Stack <Integer> st = new Stack<>();
        for(int i = 0; i<t.length; i++){
            if(t[i].charAt(0) == '+'){
                int b = Integer.valueOf(st.pop());
                int a = Integer.valueOf(st.pop());
                st.push(a+b);
            }
            
            else if(t[i].charAt(0) == '*'){
                int b = Integer.valueOf(st.pop());
                int a = Integer.valueOf(st.pop());
                st.push(a*b);
            }
            
            else if(t[i].charAt(0) == '/'){
                int b = Integer.valueOf(st.pop());
                int a = Integer.valueOf(st.pop());
                st.push(a/b);
            }
            else if(t[i].charAt(0) =='-' && t[i].length()==1){
                int b = Integer.valueOf(st.pop());
                int a = Integer.valueOf(st.pop());
                st.push(a-b);
            }
            else{
                st.push(Integer.valueOf(t[i]));
            }
        }
        int j = st.pop();
        return j;
    }
}