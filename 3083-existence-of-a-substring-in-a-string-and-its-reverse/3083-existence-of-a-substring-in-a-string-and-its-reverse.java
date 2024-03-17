class Solution {
    public boolean isSubstringPresent(String s) {
        String rev = "";
        for(int i = 0;i<s.length();i++){
            rev = s.charAt(i)+rev;
        }
        HashSet<String>hm = new HashSet<>();
        for(int i = 0;i<s.length()-1;i++){
            hm.add(rev.substring(i,i+2));
        }
        for(int i = 0;i<s.length()-1;i++){
            if(hm.contains(s.substring(i,i+2))){return true;}
        }
        return false;
    }
}