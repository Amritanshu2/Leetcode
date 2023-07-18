class Solution {
    public boolean detectCapitalUse(String w) {
        int j = 0;
        if((int)w.charAt(0)<97){
            for(int i = 1;i<w.length();i++){
                 if((int)w.charAt(i)<97){j++;}
            }
            if(j != w.length()-1 && j != 0){return false;}
            
        }
        else{
             for(int i = 1;i<w.length();i++){
                 if((int)w.charAt(i)<97){return false;}
            }
        }
        return true;
    }
}