class Solution {
    public String getEncryptedString(String s, int k) {
        String a = "";
        for(int i = 0;i<s.length();i++){
            a += s.charAt((i+k)%s.length());
        }
        return a;
    }
}