import java.util.*;

class Solution {
    
    public class Key implements Comparable<Key> {
        char c;
        int time;
        
        Key(char c, int time) {
            this.c = c;
            this.time = time;
        }
        
        @Override
        public int compareTo(Key other) {
            
            return Integer.compare(this.time, other.time);
        }
    }
    
    public int minimumPushes(String word) {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        
        PriorityQueue<Key> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.time, a.time));
        
        
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        
        
        for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            pq.add(new Key(key, value));
        }
        
        int total = 0;
        int push = 1;
        int button = 2;
        
        
        while (!pq.isEmpty()) {
            Key current = pq.remove();
            total += push * current.time;
            button++;
            
            if (button == 10) {
                button = 2;
                push++;
            }
        }
        
        return total;
    }
}
