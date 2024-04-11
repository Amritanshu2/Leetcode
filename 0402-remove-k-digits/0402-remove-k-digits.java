class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int n = num.length();
        for(int i = 0; i < n; i++){
            char c = num.charAt(i);
            while(st.size() != 0 && st.peek() > c && k > 0){
                st.pop();
                k--;
            }
            if(st.size() != 0 || c != '0'){
                st.push(c);
            }
        }
        while(st.size() != 0 &&  k > 0){
                st.pop();
                k--;
            }
        if(st.size() == 0){
            return "0";
        }
        String s = "";
        while(st.size()>0){
            
            s = st.pop() +s;
        }
        
        
        while(s.length()!=0 && s.charAt(0) == '0'){
            s = s.substring(1);
        }
        if(s==""){return "0";}
        return s;
            
    }
}