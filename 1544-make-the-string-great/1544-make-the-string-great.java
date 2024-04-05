class Solution {
    public String makeGood(String s) {
        Stack<Character>st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            int a = 32+(int)s.charAt(i);
            if(st.size()==0){st.push(s.charAt(i));continue;}
            if(a == (int)st.peek() ||  ((int)s.charAt(i))-32  == (int)st.peek()){
                st.pop();
            }
            else{st.push(s.charAt(i));}
        }
        s = "";
        while(st.size()>0){
            s = st.pop()+s;
        }
        return s;
    }
}