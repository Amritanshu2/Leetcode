class Solution {
    public int countSegments(String s) {
        int i = 1;int num = 0;
        while(i<s.length()){
            if(s.charAt(i) == ' ' && s.charAt(i-1)!= ' '){
                num ++;
            }i++;
        }
        if(s.length() == 0){return 0;}
        else if (s.charAt(s.length()-1)==' '){return num;}
        return num+1;
    }
}