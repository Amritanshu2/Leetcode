class Solution {
    public int minimizedStringLength(String s) {
        HashMap<Character,Integer>hm = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            hm.put(s.charAt(i),1);
        }
        return hm.size();
    }
}