class Solution {
    public String fractionAddition(String expression) {
        int num = 0;int den = 1;char sign = '+';int curr = 0;
        for(int i = 0;i<expression.length();i++){
            
            char c = expression.charAt(i);
            
            if(c == '+' || c == '-'){sign = c;continue;}
            if(c == '/'){
                int curd = 0;i++;
                while(i<expression.length() && expression.charAt(i) != '+' && expression.charAt(i) != '-'){
                    curd = curd*10+((int)expression.charAt(i)-'0');i++;
                }
                i--;
                if(sign == '+'){num = num*curd + curr*den;}
                else{num = num*curd - curr*den;}
                den = den*curd;
                curr = 0;
                
            }
            
            else{
                curr = curr*10 + ((int)c-'0');
            }
        }
        int a = Math.abs(findHCF(num,den));
        num = num/a;den = den/a;
        
        return ""+num+'/'+den;
    }
    
    public int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}