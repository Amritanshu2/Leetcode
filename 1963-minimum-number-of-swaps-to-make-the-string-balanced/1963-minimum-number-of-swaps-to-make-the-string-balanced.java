class Solution {
    public int minSwaps(String s) {
        String[] br = s.split("");int j = s.length()-1;
        Stack<String>st = new Stack<>();
        int step = 0;
        for(int i = 0;i<s.length();i++){
           if(br[i].equals("]")){
               if(st.size()!=0 && st.peek().equals("[")){st.pop();continue;}
               else{
                   while(!br[j].equals("[")){j--;}
                   br[i] = "[" ; br[j] = "]";
                   step ++;
               }
           } 
            st.push(br[i]);
        }
        return step;
    }
}