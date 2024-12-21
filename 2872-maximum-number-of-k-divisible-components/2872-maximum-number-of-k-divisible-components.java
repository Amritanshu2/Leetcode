import java.util.*;

class Solution {
    
    public class Edge {
        int src, des, wt;
        Edge(int src, int des, int wt) {
            this.src = src;
            this.des = des;
            this.wt = wt;
        }
    }
    
    List<Edge>[] tree;
    int count = 0;
    int k;
    
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        this.k = k;
        tree = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }
        
        for (int[] edge : edges) {
            tree[edge[0]].add(new Edge(edge[0], edge[1], values[edge[1]]));
            tree[edge[1]].add(new Edge(edge[1], edge[0], values[edge[0]]));
        }
        
        dfs(0, -1, values);
        return count;
    }
    
    private long dfs(int node, int parent, int[] values) {
        long subtreeSum = values[node];
        
        for (Edge edge : tree[node]) {
            int neighbor = edge.des;
            if (neighbor != parent) {
                subtreeSum += dfs(neighbor, node, values);
            }
        }
        
        if (subtreeSum % k == 0) {
            count++;
            return 0;
        }
        
        return subtreeSum;
    }
}
