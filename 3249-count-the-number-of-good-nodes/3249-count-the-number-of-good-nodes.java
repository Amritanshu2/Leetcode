import java.util.*;

public class Solution {
    
    public class Edge {
        int src, des;
        Edge(int src, int des) {
            this.src = src;
            this.des = des;
        }
    }
    
    HashSet<Integer> hs = new HashSet<>();
    
    public int countGoodNodes(int[][] edges) {
        
        List<Edge>[] arr = new ArrayList[edges.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }
        
       
        for (int i = 0; i < edges.length; i++) {
            arr[edges[i][0]].add(new Edge(edges[i][0], edges[i][1]));
            arr[edges[i][1]].add(new Edge(edges[i][1], edges[i][0]));
        }
        
        
        check(arr, 0, -1);
        
       
        return hs.size();
    }
    
    public int check(List<Edge>[] arr, int src, int parent) {
        int max = 0;
        int len = -1; 
        boolean isGood = true;
        
        for (Edge edge : arr[src]) {
            if (edge.des != parent) {
                int subtreeSize = check(arr, edge.des, src);
                if (len == -1) {
                    len = subtreeSize; 
                } else if (len != subtreeSize) {
                    isGood = false; 
                }
                max += subtreeSize;
            }
        }
        
        if (isGood) {
            hs.add(src);
        }
        
        return max + 1; 
    }
}
