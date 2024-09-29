import java.util.HashMap;
import java.util.PriorityQueue;

public class AllOne {
    
    public class Node implements Comparable<Node> {
        String s;
        int cnt;
        
        Node(String s, int cnt) {
            this.s = s;
            this.cnt = cnt;
        }
        
        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.cnt, other.cnt);
        }
    }
    
    PriorityQueue<Node> sm;
    PriorityQueue<Node> lm;
    HashMap<String, Node> hm = new HashMap<>();
    
    public AllOne() {
        sm = new PriorityQueue<>(); // Min heap
        lm = new PriorityQueue<>((a, b) -> b.cnt - a.cnt); // Max heap
    }
    
    public void inc(String key) {
        if (hm.containsKey(key)) {
            Node n = hm.get(key);
            sm.remove(n);
            lm.remove(n);
            n.cnt++;
            sm.add(n);
            lm.add(n);
        } else {
            Node n1 = new Node(key, 1);
            hm.put(key, n1);
            sm.add(n1);
            lm.add(n1);
        }
    }
    
    public void dec(String key) {
        if (hm.containsKey(key)) {
            Node n = hm.get(key);
            sm.remove(n);
            lm.remove(n);
            n.cnt--;
            if (n.cnt == 0) {
                hm.remove(key);
            } else {
                sm.add(n);
                lm.add(n);
            }
        }
    }
    
    public String getMaxKey() {
        return lm.isEmpty() ? "" : lm.peek().s;
    }
    
    public String getMinKey() {
        return sm.isEmpty() ? "" : sm.peek().s;
    }
}
