class Solution {
    public int minLength(String s) {
        Stack<Character>st = new Stack<>();
        int i = 0;
        while(i<s.length()){
            if(st.size()==0){st.push(s.charAt(i));}
            else if(s.charAt(i) == 'B' || s.charAt(i) == 'D'){
                if(s.charAt(i) == 'B'){if(st.peek() == 'A')st.pop();
                                      else{st.push(s.charAt(i));}}
                else if(s.charAt(i) == 'D'){if(st.peek() == 'C')st.pop();
                                           else{st.push(s.charAt(i));}}
                
            }
            else{
                st.push(s.charAt(i));
            } i++;
        }
        return st.size();
    }
}