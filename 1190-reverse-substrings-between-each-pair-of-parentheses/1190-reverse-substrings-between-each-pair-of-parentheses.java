import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        
        while (i < s.length()) {
            if (s.charAt(i) == ')') {
                char a = st.pop();
                String as = "";
                while (a != '(') {
                    as += a;
                    a = st.pop();
                }
                for (int j = 0; j < as.length(); j++) {
                    st.push(as.charAt(j));
                }
            } else {
                st.push(s.charAt(i));
            }
            i++;
        }
        
        String g = "";
        while (!st.isEmpty()) {
            g = st.pop() + g;
        }
        
        return g;
    }
}
