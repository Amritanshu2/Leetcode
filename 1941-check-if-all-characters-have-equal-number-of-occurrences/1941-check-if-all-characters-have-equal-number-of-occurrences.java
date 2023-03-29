class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>hm = new HashMap<>();
        for(int i = 0; i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                int a = hm.get(s.charAt(i));
            hm.put(s.charAt(i),a+1);
            }
            else{
                hm.put(s.charAt(i),1);
            }
        }
        int num = hm.get(s.charAt(0));
        for(Character key : hm.keySet()){
            if( num != hm.get(key)){
                return false;
            }
        }
        return true;
    }
}