class Solution {
    public int minAddToMakeValid(String s) {
        int n = 0;Stack<Character>st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ')'){
                if(st.empty() || st.peek() != '('){
                    n++;
                }
                else{st.pop();}
            }
            else{st.push(s.charAt(i));}
        }
        n = n + st.size();
        return n;
    }
}