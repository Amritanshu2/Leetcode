class Solution {

    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        
        if(((int)coordinate1.charAt(0)-'a')%2 == ((int)coordinate2.charAt(0)-'a')%2 && ((int)coordinate1.charAt(1)-'a')%2 == ((int)coordinate2.charAt(1)-'a')%2){
            return true;
        }
        else if(((int)coordinate1.charAt(0)-'a')%2 != ((int)coordinate2.charAt(0)-'a')%2 && ((int)coordinate1.charAt(1)-'a')%2 != ((int)coordinate2.charAt(1)-'a')%2){return true;}
        return false;
        
    }
}