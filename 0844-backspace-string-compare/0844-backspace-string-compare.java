class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> ts = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(st.empty()!= true && s.charAt(i)=='#'){
                st.pop();
            }
            else if(s.charAt(i)!='#'){st.push(s.charAt(i));}
        }
        for(int i = 0;i<t.length();i++){
            if(ts.empty()!= true && t.charAt(i)=='#'){
                ts.pop();
            }
            else if(t.charAt(i)!='#'){ts.push(t.charAt(i));}
        }
        if(st.size()!=ts.size()){return false;}
        while(st.empty()!= true && ts.empty()!= true){
            if(st.pop()!=ts.pop()){return false;}
        }
        return true;
        
        
        
    }
}