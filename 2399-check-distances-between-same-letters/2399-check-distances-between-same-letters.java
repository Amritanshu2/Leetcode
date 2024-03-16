class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character,Integer>hm = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),i - hm.get(s.charAt(i))-1);
            }
            else{
                hm.put(s.charAt(i),i);
            }
        }
        char alpha[]= new char[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = (char) ('a' + i); 
        }
        System.out.println(hm);
        for(int i = 0;i<26;i++){
            if(hm.containsKey(alpha[i]) && hm.get(alpha[i]) != distance[i]){
                return false;
            }
        }
        
        return true;
    }
}