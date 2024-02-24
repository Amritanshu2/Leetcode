class Solution {
    char[] characters = new char[26];
    
    
    public String replaceDigits(String s) {
        
        for (int i = 0; i < 26; i++) {
            characters[i] = (char) ('a' + i);
        }
        String a = "";
        for(int i = 0;i<s.length();i+=1){
            if(i%2==0){a += s.charAt(i);}
            else{
                int b = s.charAt(i)-'0';
                int c = s.charAt(i-1)-'a';
                a+= characters[(c+b)%26];
            }
        }
        return a;
    }
}