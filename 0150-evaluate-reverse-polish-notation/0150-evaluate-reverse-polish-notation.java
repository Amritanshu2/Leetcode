class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<tokens.length;i++){
            char c = tokens[i].charAt(0);
            if(c != '+' && c!= '-' && c!= '*' && c!= '/' || tokens[i].length()>1){
                st.push(Integer.parseInt(tokens[i]));
            }
            
            else{
                int a = st.pop();
                int b = st.pop();
                if(c == '+'){st.push(b+a);}
                if(c=='*'){st.push(b*a);}
                if(c=='/'){st.push(b/a);}
                if(c=='-'){st.push(b-a);}
            }
        }
        return st.pop();
}}