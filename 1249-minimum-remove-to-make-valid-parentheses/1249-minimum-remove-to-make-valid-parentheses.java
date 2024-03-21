class Solution {
    
    public static class par{
        char c;
        int pos;
        
        par(char c,int pos){
            this.c = c;
            this.pos = pos;
        }
    }
    
    public String minRemoveToMakeValid(String s) {
        
        Stack<par>st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == ')'){
                if(s.charAt(i)=='('){st.push(new par('(',i));}
                else{
                    if(st.size()!= 0 && st.peek().c == '('){st.pop();}
                    else{st.push(new par(')',i));}
                }
            }  
        }
        
        List<Integer>al = new ArrayList<>();
        while(st.size()!=0){
            al.add(0,st.peek().pos);
            st.pop();
        }
        // System.out.println(al);
        String as = "";int j = 0;
        for(int i = 0;i<s.length();i++){
            if(al.size()>0 && i == al.get(0)){al.remove(0);continue;}
            else{
                as += s.charAt(i);
            }
        }
        return as;
        
    }
}