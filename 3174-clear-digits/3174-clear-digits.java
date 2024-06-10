class Solution {
    public String clearDigits(String s) {
        Stack<Character>st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)-'0' <= 9 && s.charAt(i)>=0){
                if(st.size()>0){st.pop();}
                continue;
            }
            st.push(s.charAt(i));
        }
        s = "";
        while(!st.isEmpty()){
            s = st.pop() + s;
        }
        return s;
    }
}