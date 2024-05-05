class LRUCache {

    HashMap<Integer,Integer>hm;List<Integer>al = new ArrayList<>();int i = 0;
    public LRUCache(int capacity) {
        hm = new HashMap<>();
        i = capacity;
        
    }
    
    public int get(int key) {
        if(!hm.containsKey(key)){return -1;}
        al.remove(Integer.valueOf(key));
        al.add(key);
        return hm.get(key);
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            al.remove(Integer.valueOf(key));
            hm.put(key,value);
            al.add(key);
            return;
        }
        if(i == al.size()){
            hm.remove(al.get(0));
            al.remove(0);
            al.add(key);
            hm.put(key,value);
            return;
        }
        else{
            al.add(key);
            hm.put(key,value);
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */