class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer>st = new Stack<>();int i = 0;
        while(i<ast.length){
            if(st.empty() ){st.push(ast[i]);i++;continue;}
            if(st.peek()>=0 && ast[i]<0){
                if(st.peek() == Math.abs(ast[i])){st.pop();i++;continue;}
                if(st.peek()>Math.abs(ast[i])){i++;continue;}
                if(st.peek()<Math.abs(ast[i])){st.pop();continue;}
            }
            st.push((ast[i]));i++;
                    
        }
        int[]ss = new int[st.size()];int h = st.size()-1;
        while(st.size()>0){
            ss[h] = st.pop();h--;
        }
        return ss;
    }}