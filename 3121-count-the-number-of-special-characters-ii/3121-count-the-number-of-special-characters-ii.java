class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) < 91) { 
                if(!map.containsKey(word.charAt(i))){
                    map.put(word.charAt(i),i);
                }
            }
            else{
                map.put(word.charAt(i),i); 
            }
        }



        for(int i = 97; i <= 122; i++) {
            if(map.containsKey((char)i)) { 
                if(map.get((char)(i-32)) != null && map.get((char)i) != -1) {  
                    if(map.get((char)(i-32)) - map.get((char)i) > 0) {
                        count++;
                        map.put((char)i,-1); 
                    }
                }
            }
        }
        return count;
    }
}