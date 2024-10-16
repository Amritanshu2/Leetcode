class Solution {
    
    public class cnt implements Comparable<cnt> {
        char c;
        int num;
        cnt(char c, int num){
            this.c = c;
            this.num = num;
        }
        
        @Override
        public int compareTo(cnt other) {
            return Integer.compare(this.num, other.num);  // Compare by num field
        }
    }
    
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<cnt>pq = new PriorityQueue<>(Collections.reverseOrder());
        if(a>0)pq.add(new cnt('a',a)); if(b>0)pq.add(new cnt('b',b)); if(c>0)pq.add(new cnt('c',c));
        String as = "";
        while(!pq.isEmpty()){
            cnt s = pq.poll();
            if(as.length() < 2 || !(as.charAt(as.length()-2) == s.c && as.charAt(as.length()-1) == s.c)){
                as+= s.c;
                s.num--;
                if(s.num>0)pq.add(s);
            }
            else if(!pq.isEmpty()){
                cnt d = pq.poll();
                as+= d.c;
                d.num--;
                if(d.num>0)pq.add(d);pq.add(s);
            }
            else{break;}
        }
        return as;
    }
}