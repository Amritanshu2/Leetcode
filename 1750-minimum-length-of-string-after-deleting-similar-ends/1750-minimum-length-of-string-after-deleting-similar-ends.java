class Solution {
    public int minimumLength(String s) {
        
        char remove = ' ';
        while(s.length()>0){
            if(remove == s.charAt(0)){s = s.substring(1);}
            else if(remove == s.charAt(s.length()-1)){s = s.substring(0,s.length()-1);}
            else if(s.length()>1 && s.charAt(0) == s.charAt(s.length()-1)){
                remove = s.charAt(0);s = s.substring(1,s.length()-1);}
            else{break;}
        }

        return s.length();
    }
}
