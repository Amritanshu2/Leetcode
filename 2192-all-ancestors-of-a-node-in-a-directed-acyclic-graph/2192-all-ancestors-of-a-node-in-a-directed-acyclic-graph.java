import java.util.*;

class Solution {
    
    public class edge {
        int src;
        int des;
        
        edge(int src, int des) {
            this.src = src;
            this.des = des;
        }
    }
    
    List<edge>[] graph;
    HashSet<Integer> al;
    
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        graph = new ArrayList[n];
        
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < edges.length; i++) {
            graph[edges[i][1]].add(new edge(edges[i][1], edges[i][0]));
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            al = new HashSet<>(); // Initialize HashSet
            hlpr(i);
            List<Integer> as = new ArrayList<>(al);
            Collections.sort(as);
            ans.add(as);
        }
        return ans;
    }
    
    public void hlpr(int src) {
        if (graph[src].size() == 0) {
            return;
        }
        
        for (int i = 0; i < graph[src].size(); i++) {
            if (al.contains(graph[src].get(i).des)) {
                continue;
            }
            al.add(graph[src].get(i).des);
            hlpr(graph[src].get(i).des);
        }
    }
}
