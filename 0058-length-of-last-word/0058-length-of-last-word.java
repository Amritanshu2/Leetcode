class Solution {
    public int lengthOfLastWord(String s) {
        int k = 0;
        int a = s.length();
        while(a>=1){
            if(s.charAt(a-1) == ' ' && k!=0){
                return k;
            }
            else if(s.charAt(a-1) == ' '){
                a--;
            }
            else{
                k++;a--;
            }
        }
        return k;
    }
}