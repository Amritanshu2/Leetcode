class MyHashMap {
    List<List<Integer>>al ;
    public MyHashMap() {
       al = new ArrayList<>();
        
    }
    
    public void put(int key, int value) {
        for(int i = 0;i<al.size();i++){
            if(al.get(i).get(0)==key){
                al.remove(i);
            }
        }
        List<Integer>all = new ArrayList<>();
        all.add(key);
        all.add(value);
        al.add(all);
    }
    
    public int get(int key) {
        for(int i = 0;i<al.size();i++){
            if(al.get(i).get(0)==key){
                return al.get(i).get(1);
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i = 0;i<al.size();i++){
            if(al.get(i).get(0)==key){
                al.remove(i);
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */