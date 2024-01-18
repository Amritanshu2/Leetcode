class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer>hs = new HashMap<>();
        
        String[] s = s1.split("\\s+");
        String[] ss = s2.split("\\s+");
        
        for(int i = 0;i<s.length;i++){
            hs.put(s[i],hs.getOrDefault(s[i],0)+1);
        }
        for(int i = 0;i<ss.length;i++){
            hs.put(ss[i],hs.getOrDefault(ss[i],0)+1);
        }
        ArrayList<String>as = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : hs.entrySet()) {
            if(entry.getValue()==1){as.add(entry.getKey());}
        }
        String[] array = as.toArray(new String[0]);
        
                
        
        return array;
    }
}