class Solution {
    String j = "";
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();int m =0;
        while(m<s.length()){
            if(s.charAt(m)=='(' ){
                if(st.empty()!=true){j = j + s.charAt(m);}
                st.push(s.charAt(m));}
            else{
                char ds = st.pop();
                if(st.empty()!=true){j= j + s.charAt(m);}
                
            }
            m++;
        }
        return j;
    }
}