class Solution {
    
    public int pali(String s,int as){
        int i = 0;int j= s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){return as;}
            i++;j--;
        }
        as ++;
        return as;
    }
    
    
    public int countSubstrings(String s) {
        int as  = 0;
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<=s.length();j++){
                String ss = s.substring(i,j);
                as = pali(ss,as);
            }
        }
        
        
        return as;
    }
}