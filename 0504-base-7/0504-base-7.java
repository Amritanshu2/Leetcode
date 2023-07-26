class Solution {
    public String convertToBase7(int num) {
        if(num == 0){return "0";}
        String f ="";
        String s = "";if(num<0){f = "-";}
        num = Math.abs(num);
        while(num>0){
            s =  num%7 + s;
            num /= 7;
        }
        return f+s;
    }
}