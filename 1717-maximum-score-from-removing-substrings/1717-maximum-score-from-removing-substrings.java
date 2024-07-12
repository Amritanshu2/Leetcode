class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character>st = new Stack<>();
        Stack<Character>ts = new Stack<>();
        int max = 0;
        if(x>=y){
            for(int i = 0;i<s.length();i++){
                if(st.size()!=0 && s.charAt(i) == 'b' && st.peek() == 'a'){st.pop();max+=x;}
                else{st.push(s.charAt(i));}
            }
            
            while(st.size()>0){
                if(ts.size()!=0 && st.peek() == 'b' && ts.peek() == 'a'){ts.pop();max+=y;st.pop();}
                else{ts.push(st.pop());}
            }
        }
        
        else{
            for(int i = 0;i<s.length();i++){
                if(st.size()!=0 && s.charAt(i) == 'a' && st.peek() == 'b'){st.pop();max+=y;}
                else{st.push(s.charAt(i));}
            }
            
            while(st.size()>0){
                if(ts.size()!=0 && st.peek() == 'a' && ts.peek() == 'b'){ts.pop();max+=x;st.pop();}
                else{ts.push(st.pop());}
            }
        }
        return max;
        
    }
}