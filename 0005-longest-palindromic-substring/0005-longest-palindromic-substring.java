class Solution {
    public String pali(String s,String as){
        int i = 0;int j= s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){return as;}
            i++;j--;
        }
        if(  s.length() > as.length() ){as = s;}
        return as;
    }
    
    
    public String longestPalindrome(String s) {
         
        String as = "";
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<=s.length();j++){
                String ss = s.substring(i,j);
                as = pali(ss,as);
            }
        }
        
        
        return as;
    }
}