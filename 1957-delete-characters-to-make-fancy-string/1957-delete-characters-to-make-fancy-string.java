class Solution {
    public String makeFancyString(String s) {
        StringBuilder s1 = new StringBuilder();
        int j = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s1.length() >= 2 && s1.charAt(j - 1) == s.charAt(i) && s1.charAt(j - 2) == s.charAt(i)) {
                continue;
            }
            s1.append(s.charAt(i));
            j++;
        }
        
        return s1.toString();
    }
}
