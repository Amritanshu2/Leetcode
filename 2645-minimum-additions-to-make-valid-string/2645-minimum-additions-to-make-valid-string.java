class Solution {
    public int addMinimum(String s) {
        int a = 0;
        Stack<Character>st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'a' && st.size()==0){st.push('a');continue;}
            else if(s.charAt(i) == 'b' && st.size()==0){st.push('a');a++;}
            else if(s.charAt(i) == 'c' && st.size()==0){st.push('a');st.push('b');a+=2;}
            else if(s.charAt(i) == 'a' ){
                if(st.peek() == 'b'){st.push('c');a++;}
                else if(st.peek() == 'a'){st.push('b');st.push('c');a+=2;}
            }
            else if(s.charAt(i) == 'b' ){
                if(st.peek() == 'c'){st.push('a');a++;}
                else if(st.peek() == 'b'){st.push('c');st.push('a');a+=2;}
            }
            else if(s.charAt(i) == 'c' ){
                if(st.peek() == 'a'){st.push('b');a++;}
                else if(st.peek() == 'c'){st.push('a');st.push('b');a+=2;}
            }
            st.push(s.charAt(i));
        }
        if(st.peek() == 'a'){a+=2;}
        else if(st.peek() == 'b'){a+=1;}
        return a;
    }
}