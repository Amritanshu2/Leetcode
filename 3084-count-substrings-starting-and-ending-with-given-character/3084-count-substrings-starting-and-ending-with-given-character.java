class Solution {
    public long countSubstrings(String s, char c) {
        long a = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == c){a++;}
        }
        return (a*(a+1))/2;
    }
}