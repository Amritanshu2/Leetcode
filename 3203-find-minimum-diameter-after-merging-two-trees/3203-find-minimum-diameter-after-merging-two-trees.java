import java.util.*;

class Solution {
    
    public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {
        List<List<Integer>> tree1 = buildTree(edges1);
        List<List<Integer>> tree2 = buildTree(edges2);
        
        int d1 = findTreeDiameter(tree1);
        int d2 = findTreeDiameter(tree2);
        
        
        return Math.max(Math.max(d1, d2),((d1 + 1) >> 1) + ((d2 + 1) >> 1) + 1); 
    }
    
    private List<List<Integer>> buildTree(int[][] edges) {
        int n = 0;
        for (int[] edge : edges) {
            n = Math.max(n, Math.max(edge[0], edge[1]));
        }
        n++;
        
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tree.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            tree.get(u).add(v);
            tree.get(v).add(u);
        }
        
        return tree;
    }
    
    private int findTreeDiameter(List<List<Integer>> tree) {
        int[] firstBFS = bfs(tree, 0);
        int farthestNode = firstBFS[1];
        int[] secondBFS = bfs(tree, farthestNode);
        return secondBFS[0];
    }
    
    private int[] bfs(List<List<Integer>> tree, int start) {
        int n = tree.size();
        boolean[] visited = new boolean[n];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start, 0});
        visited[start] = true;
        
        int maxDistance = 0;
        int farthestNode = start;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int node = current[0];
            int distance = current[1];
            
            if (distance > maxDistance) {
                maxDistance = distance;
                farthestNode = node;
            }
            
            for (int neighbor : tree.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(new int[]{neighbor, distance + 1});
                }
            }
        }
        
        return new int[]{maxDistance, farthestNode};
    }
}
