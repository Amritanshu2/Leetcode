class Solution {
    public boolean squareIsWhite(String c) {
        int a = c.charAt(0)-'0';int b = c.charAt(1)-'0';
        if(a%2==0){
            if(b%2==0){return false;}
            else{return true;}
        }
        else{
            if(b%2!=0){return false;}
            else{return true;}
        }
    }
}