class Solution {
    public int maxPower(String s) {
        int max = -1;
        char prev = ' ';int c = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != prev){c = 0;}
            prev = s.charAt(i);
            c++;
            max = Math.max(max,c);
        }
        return max;
    }
}