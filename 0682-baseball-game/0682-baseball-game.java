class Solution {
    public int calPoints(String[] s) {
        Stack<Integer>st = new Stack<>();
        for(int i = 0;i<s.length;i++){
            if(s[i].charAt(0) == 'C'){
                st.pop();
            }
            else if(s[i].charAt(0) == 'D'){
                st.push(st.peek()*2);
            }
            else if(s[i].charAt(0) == '+' && st.size()>=2){
                int a = st.pop();
                int b = st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
            else if(s[i].charAt(0)!='+'){
                st.push(Integer.parseInt(s[i]));
            }
        }
        int a = 0;
        while(st.size()>0){
            a+=st.pop();
        }
        return a;
    }
}