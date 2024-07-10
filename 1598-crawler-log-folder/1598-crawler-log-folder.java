class Solution {
    public int minOperations(String[] logs) {
        Stack<Integer>st = new Stack<>();
        for(int i = 0;i<logs.length;i++){
            if(logs[i].equals("./") || st.size() == 0 && logs[i].equals("../")){continue;}
            if(logs[i].equals("../")){st.pop();}
            else{st.push(0);}
            
        }
        return st.size();
    }
}