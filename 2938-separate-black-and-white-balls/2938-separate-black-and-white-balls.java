
        

class Solution {
    public long minimumSteps(String s) {
        int i = 0;int j = 0;long tot = 0;
        while(j<s.length()){
            if(s.charAt(j) =='0'){
                tot+= j-i;
                i++;j++;    
            }
            else{j++;}
        }
        return tot;
    }
}