class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm = new HashMap<>();
        for(int i= 0 ;i<s.length();i++){
            char c = s.charAt(i);char m = t.charAt(i);
            if(hm.containsKey(c)){
                if(hm.get(c)!=m){return false;}
            }
            else{
                if(hm.containsValue(m)){return false;}
                hm.put(c,m);
            }
        }
        
        return true;
    }
}