class Solution {
    public int calculate(String s) {
        Stack<Integer>num = new Stack<>();
        Stack<Character>st = new Stack<>();
        int prev = 0;
        for(int i = 0;i<s.length();i++){
            
            char ch = s.charAt(i);
            if (ch == ' ') continue;
            
            if(ch >= '0' && ch <= '9'){
                String a = ch+"";int idx = i+1;
                while(idx<s.length() && s.charAt(idx)>='0' && s.charAt(idx) <= '9'){
                    a+=s.charAt(idx);idx++;
                }
                i = idx-1;int b = Integer.parseInt(a);
                if(st.size()!= 0 && (st.peek() == '+' || st.peek() == '-' ||st.peek() == '*')){
                    num.push(calVal(num.pop(),b,st.pop()));
                }
                else{num.push(b);}
                prev = 1;
            }
            
            else if(ch == '(' || ch == '+'){prev = 0;st.push(ch);}
            else if(ch == '-'){
                if(prev != 1){
                    num.push(-1);
                    st.push('*');
                    }
                else if(prev == 1){prev = 0;st.push(ch);}
            }
            
            else if(ch == ')'){
                while(st.peek()!='('){
                    int a = num.pop();int b = num.pop();
                    num.push(calVal(b,a,st.pop()));
                }
                st.pop();prev = 1;
                if(st.size()!=0 && st.peek() != '('){
                    int a = num.pop();int b = num.pop();
                    num.push(calVal(b,a,st.pop()));
                }
            }
            
               
        }
        
        
        while (!st.isEmpty()) {
            int a = num.pop();
            int b = num.pop();
            num.push(calVal(b, a, st.pop()));
        }
        
        
        return num.peek();
    }
    
    
    public static int calVal(int a, int b, char optr){ 
    if(optr == '+'){
        return a+b;
    }
    else if(optr == '-'){
        return a - b;
    }
    else if(optr == '*'){
        return a*b;
    }
    
    return 0;
}
}