class Solution {
    public String addBinary(String a, String b) {
        String  h  = "";
        int i = 0;int rem = 0;
        while(i<a.length() && i<b.length()){
            int x = (int)a.charAt(a.length()-1-i)-(int)('0');
            int y = (int)b.charAt(b.length()-1-i)-'0';
            int z = (x+y+rem)%2;
            h = z + h;
            rem = (x+y+rem)/2;
            i++;
        }
        while(i<a.length()){
            int x = (int)a.charAt(a.length()-1-i)-'0';
            int z = (x+rem)%2;
            h = z + h;
            rem = (x+rem)/2;
            i++;
        }
        
        while(i<b.length()){
            int y = (int)b.charAt(b.length()-1-i)-'0';
            int z = (y+rem)%2;
            h = z + h;
            rem = (y+rem)/2;
            i++;
        }
        if(rem != 0){
            h = rem + h;
        }
        return h;
        
        
    }
}