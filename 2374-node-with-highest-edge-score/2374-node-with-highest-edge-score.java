class Solution {
    public int edgeScore(int[] edges) {
        HashMap<Integer,Long>hm = new HashMap<>();
        for(int i = 0;i<edges.length;i++){
            hm.put(i,0L);
        }
        for(int i = 0;i<edges.length;i++){
            hm.put(edges[i],hm.get(edges[i])+i);
        }
        long max = 0;int mi = 0;
        for(int i = 0;i<edges.length;i++){
            if(hm.get(i)>max){mi = i;max = hm.get(i);}
        }
        return mi;
    }
}