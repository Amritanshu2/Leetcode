class Solution {
    
    public class edge implements Comparable<edge>{
        int a = 0;int b = 0;int sum = 0;
        edge(int a, int b){
            this.a = a;this.b = b;this.sum = a+b;
        }
        
        @Override
        public int compareTo(edge other) {
            return Integer.compare(this.sum, other.sum);
        }
    }
    
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>>al = new ArrayList<>();
        
        
        
        PriorityQueue<edge>pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0;i<nums1.length;i++){
            int h = 0;
            if(pq.size() == k){
                if(nums1[i]+nums2[0] >= pq.peek().sum){break;}
            }
            
            for(int j = h;j<nums2.length;j++){
                edge a = new edge(nums1[i],nums2[j]);
                pq.add(a);
                if(pq.size()>k){edge b = pq.remove();if(a == b)break;}
            }
        }
        while(k!=0){
            edge prio = pq.remove();
            List<Integer>as = new ArrayList<>();
            as.add(prio.a);as.add(prio.b);
            al.add(0,as);k--;
        }
        return al;
    }
}