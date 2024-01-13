class Solution {
    public boolean closeStrings(String w1, String w2) {
        if(w1.length()!=w2.length()){return false;}
        HashSet<Character>hs = new HashSet<>();
        HashMap<Character,Integer>hm = new HashMap<>();
        for(int i = 0;i<w1.length();i++){
            hs.add(w1.charAt(i));
            hm.put(w1.charAt(i), hm.getOrDefault(w1.charAt(i), 0) + 1);
        }
        HashMap<Character,Integer>hmm = new HashMap<>();
        for(int i = 0;i<w2.length();i++){
            if(!hs.contains(w2.charAt(i))){return false;}
            hmm.put(w2.charAt(i), hmm.getOrDefault(w2.charAt(i), 0) + 1);
        }
        HashMap<Integer,Integer> h1 = new HashMap<>();
        for (char key : hm.keySet()) {
            h1.put(hm.get(key), h1.getOrDefault(hm.get(key), 0) + 1);
        }
        HashMap<Integer,Integer> h2 = new HashMap<>();
        for (char key : hmm.keySet()) {
            h2.put(hmm.get(key), h2.getOrDefault(hmm.get(key), 0) + 1);
        }
        for (Integer key : h1.keySet()) {
            if(!h2.containsKey(key) || h1.get(key)!=h2.get(key)){return false;}
        }
        
       
        
        return true;
    }
}