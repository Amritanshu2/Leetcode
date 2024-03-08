class MyHashSet {
    ArrayList<Integer>al;
    public MyHashSet() {
        al = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        for(int i = 0;i<al.size();i++){
            if(al.get(i)==key){return;}
        }
        al.add(key);
    }
    
    public void remove(int key) {
        for(int i = 0;i<al.size();i++){
            if(al.get(i)==key){al.remove(i);return;}
        }
    }
    
    public boolean contains(int key) {
        for(int i = 0;i<al.size();i++){
            if(al.get(i)==key){return true;}
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */