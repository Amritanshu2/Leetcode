class Solution {
    
    public static class edge {
        int cur;
        int next;
        edge(int cur,int next){
            this.cur = cur;
            this.next = next;
        }
    }
    
    ArrayList<edge>[]arr;
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        arr = new ArrayList[n];
        for(int i = 0;i<n;i++){
            arr[i] = new ArrayList<>();
        }
        for(int i = 0;i<edges.length;i++){
            arr[edges[i][0]].add(new edge(edges[i][0],edges[i][1]));
            arr[edges[i][1]].add(new edge(edges[i][1],edges[i][0]));
        }
        return check(source,destination);
    }
    
    HashSet<Integer>hs = new HashSet<>();
    
    public boolean check(int source, int destination){
        if(source == destination){return true;}
        hs.add(source);boolean ss = false;
        ArrayList<edge> al = arr[source];
        for(int i = 0;i<al.size() && ss!=true;i++){
            if(!hs.contains(al.get(i).next)){
                ss = check(al.get(i).next,destination);
            }
        }
        return ss;
        
    }
}