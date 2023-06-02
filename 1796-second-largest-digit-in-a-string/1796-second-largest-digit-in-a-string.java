class Solution {
    public int secondHighest(String s) {
        HashMap<Integer,Integer> al = new HashMap<>();
        for(int i = 0;i< s.length();i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57 && al.containsKey(s.charAt(i))!=true) al.put((int)s.charAt(i) - (int)('0'),1);
        }
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for (Map.Entry<Integer,Integer> mapElement : al.entrySet()) {
            Integer key = mapElement.getKey();
            pq.add(key);
            
        }
        if(pq.peek()!=null)
        pq.remove();
        
        if(pq.peek()!=null)
        return pq.peek();
        
       
        
        
        
        
        
        
        return -1;
    }
}