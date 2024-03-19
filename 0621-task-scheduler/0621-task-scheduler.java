class Solution {
    public int leastInterval(char[] tasks, int n) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Info> pq = new PriorityQueue<>((a, b) -> b.val - a.val);
        List<Info> next = new ArrayList<>();
        
        for(char ch : tasks){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        for(char key : map.keySet()){
            pq.offer(new Info(key, map.get(key)));
        }
        
        while(!pq.isEmpty()){
            for(int i = 0; i <= n; i++){
                if(!pq.isEmpty()){
                    Info info = pq.poll();
                    info.val -= 1;
                    if(info.val > 0){
                        next.add(info);
                    }
                }
                res++;
                if(pq.isEmpty() && next.isEmpty()){
                    break;
                }
            }
            pq.addAll(next);
            next.clear();
        }
        
        return res;
    }
    
    static class Info{
        char key;
        int val;
         
        public Info(char key, int val){
            this.key = key;
            this.val = val;
        }
    }
}