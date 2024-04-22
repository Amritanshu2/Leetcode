class Solution {
    
    public class edge{
        int src;
        int des;
        edge(int src, int des){
            this.src = src;
            this.des = des;
        }
    }
    int max = -1;boolean[]vis;
    public int longestCycle(int[] edges) {
        vis = new boolean[edges.length];
        // List<Integer>[]arr = new List[edges.length];
        for(int i = 0;i<edges.length;i++){
            if(vis[i] == true){continue;}
            HashMap<Integer,Integer>hs = new HashMap<>();
            chk(edges,i,hs,0);
        }
        return max;
    }
    
    public void chk(int[]edges, int curr, HashMap<Integer,Integer>hm, int pos){
        if(curr == -1 ){return ;}
        
        if(hm.containsKey(curr)){
            max = Math.max(max,pos-hm.get(curr));
            return;
        }
        if( vis[curr] == true){return ;}
        vis[curr] = true;
        hm.put(curr,pos);
        vis[curr] = true;
        chk(edges,edges[curr],hm,pos+1);
    }
}