import java.util.*;

class Solution {
    
    public class Graph{
        int src;
        int des;
        Graph(int src, int des){
            this.src = src;
            this.des = des;
        }
    }
    
    List<List<Integer>> ans = new ArrayList<>();
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Graph>[] arr = new ArrayList[graph.length];
        for(int i = 0; i < graph.length; i++){
            List<Graph> al = new ArrayList<>();
            for(int j = 0; j < graph[i].length; j++){
                al.add(new Graph(i, graph[i][j]));
            }
            arr[i] = al;
        }
        
        check(0, arr, new ArrayList<Integer>());
        return ans;
    }
    
    public void check(int i, List<Graph>[] arr, List<Integer> path){
        path.add(i);
        if(i == arr.length - 1){
            ans.add(new ArrayList<>(path));
        }
        
        for(int j = 0; j < arr[i].size(); j++){
            int g = arr[i].get(j).des;
            check(g, arr, path);
            path.remove(path.size() - 1); // backtrack
        }
    }
}
