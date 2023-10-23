class Solution {
    public int maxDepth(String s) {
        int d = 0;
        Stack<Character>st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                st.push('(');
                d = Math.max(d,st.size());
            }
            else if (c==')'){
                st.pop();
            }
        }
        return d;
    }
}