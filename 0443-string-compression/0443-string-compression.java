class Solution {
    public int compress(char[] chars) {
        
        char prev = ' ';int num = 0;String asd ="";
        for(int i = 0;i<=chars.length;i++){
            
            if(prev == ' '){num++;prev = chars[i];continue;}
            
            if(i == chars.length || prev != chars[i]){
                asd = asd + prev;String ans = "";
                if(num == 1){num = 0;}
                while(num>0){ans = "" + (num%10) + ans;num/=10;}
                num = 1;
                asd = asd + ans;
                if(i!=chars.length){prev = chars[i];}
                
            }
            else if(prev == chars[i]){num++;}
            
        }
        
        for(int i = 0;i<asd.length();i++){
            chars[i] = asd.charAt(i);
        }
        return asd.length();
            
    }
}