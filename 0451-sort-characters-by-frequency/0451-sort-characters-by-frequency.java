import java.util.Map.Entry;
class Solution {
    public String frequencySort(String s) {
        String h = "";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){hm.put(s.charAt(i),hm.get(s.charAt(i))+1);}
            else{hm.put(s.charAt(i),1);}
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(Entry<Character, Integer> entry: hm.entrySet()) {
            pq.add(entry.getValue());
         
        }
        while(pq.size()>0){
            int Key = pq.remove();
             for(Entry<Character, Integer> entry: hm.entrySet()) {
                 if(entry.getValue() == Key) {
                    while(Key>0){
                        h = entry.getKey() + h;Key--;
                    }
                     hm.remove(entry.getKey());
                     break;
                 }
            }
        }
        return h ;
    }
}