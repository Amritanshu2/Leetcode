class Solution {
    public String rom(String s){
        Stack<Character>st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '#' && st.size()>0){
                st.pop();
            }
            else if (s.charAt(i)!= '#'){
                st.push(s.charAt(i));
            }
        }
        s = "";
        while(st.size()>0){
            s  = st.pop() +s;
        }
        System.out.println(s);
        return s;
    }
    public boolean backspaceCompare(String s, String t) {
        String a = rom(s);
        String b = rom(t);
        if(a.length()!= b.length()){return false;}
        for(int i = 0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){return false;}
        }
        return true;
        
    }
}