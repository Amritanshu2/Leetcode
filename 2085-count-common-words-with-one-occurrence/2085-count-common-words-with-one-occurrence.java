class Solution {
    public int countWords(String[] w1, String[] w2) {
        HashMap<String,Integer>h1 = new HashMap<>();
        HashMap<String,Integer>h2 = new HashMap<>();int a = 0;
        for(int i = 0;i<w1.length;i++){
            h1.put(w1[i],h1.getOrDefault(w1[i], 0) + 1);
        }
        for(int i = 0;i<w2.length;i++){
            h2.put(w2[i],h2.getOrDefault(w2[i], 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : h1.entrySet()) {
            if(h1.get(entry.getKey())==1 && h2.containsKey(entry.getKey()) && h2.get(entry.getKey())==1){a++;}
        }
        return a;
    }
}