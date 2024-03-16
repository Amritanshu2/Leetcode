class Solution {
    
    public static class edge {
        int cur;
        int next;
        edge(int cur,int next){
            this.cur = cur;
            this.next = next;
        }
    }
    
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<edge>[] graph = new ArrayList[n];
        for(int i = 0;i<n;i++){
            graph[i] = new ArrayList<>();
        }
        int count = 0;
        
        for(int i = 0; i < edges.length; i++){
            graph[edges[i][0]].add(new edge(edges[i][0],edges[i][1]));
            graph[edges[i][1]].add(new edge(edges[i][1],edges[i][0]));
        }
        ArrayList<Integer>al = new ArrayList<>();
        for(int i = 0;i<n;i++){
            al.add(i);
        }
        
        while(al.size()>0){
            List<Integer>as  = new ArrayList<>();
            as.add(al.get(0));
            
            for(int i = 0;i<graph[al.get(0)].size();i++){
                as.add(graph[al.get(0)].get(i).next);
                al.remove(Integer.valueOf(graph[al.get(0)].get(i).next));
            }
            al.remove(0);
            if(check(as,graph)){count++;}
            
        }
        return count++;
    }
    public static boolean check(List<Integer>al ,ArrayList<edge>[] graph){
        HashSet<Integer>hs = new HashSet<>(al);
        for(int i = 0;i<al.size();i++){
            if(graph[al.get(i)].size() != al.size()-1){return false;}
            for(int i1 = 0;i1<graph[al.get(i)].size();i1++){
                if(!hs.contains(graph[al.get(i)].get(i1).next)){return false;}
            }
        }
        return true;
    }
}