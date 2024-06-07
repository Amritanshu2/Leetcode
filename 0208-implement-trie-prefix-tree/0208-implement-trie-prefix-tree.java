class Trie {
    
    HashSet<String>hs;
    List<String>al;

    public Trie() {
        hs = new HashSet<>();
        al = new ArrayList<>();
    }
    
    public void insert(String word) {
        hs.add(word);
        al.add(word);
    }
    
    public boolean search(String word) {
        return hs.contains(word);
    }
    
    public boolean startsWith(String prefix) {
        for(int i = 0;i < al.size();i++){
            if(al.get(i).length() < prefix.length()){continue;}
            String dictSet = al.get(i).substring(0, prefix.length());
            if (dictSet.contains(prefix)) {
                
                return true; 
            }
            
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */