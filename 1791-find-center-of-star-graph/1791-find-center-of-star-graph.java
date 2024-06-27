class Solution {
    
    HashMap<Integer,Integer>hm = new HashMap<>();
    
    public int findCenter(int[][] edges) {
        for(int i = 0;i<edges.length;i++){
            
                hm.put(edges[i][0],hm.getOrDefault(edges[i][0],0)+1);
                hm.put(edges[i][1],hm.getOrDefault(edges[i][1],0)+1);
            
        }
        for (Integer key : hm.keySet()) {
            Integer value = hm.get(key);
            if(value+1 == hm.size()){return key;}
        }
        return -1;
    }
}