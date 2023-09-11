class Solution {
    public String addStrings(String num1, String num2) {
        String num = "";
        int i = 0;int rem = 0;
        while(i<num1.length() && i<num2.length()){
            int g =(int)( num1.charAt(num1.length()-1-i))-'0';
            int h = (int)(num2.charAt(num2.length()-1-i))-'0';
            num = (g+h + rem)%10 +num ;
            rem = (g+h + rem)/10;i++;
        }
        while(i<num2.length()){
            
            int h = (int)(num2.charAt(num2.length()-1-i))-'0';
            num = (h + rem)%10 +num ;
            rem = (h + rem)/10;i++;
        }
        while(i<num1.length()){
            
            int g = (int)(num1.charAt(num1.length()-1-i))-'0';
            num =  (g+ rem)%10 +num  ;
            rem = (g + rem)/10;i++;
        }
        if(rem != 0){
            num = rem + num;
        }
        return num;
        
    }
}