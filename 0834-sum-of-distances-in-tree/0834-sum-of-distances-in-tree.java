class Solution {
    
    public class Edge {
        int src;
        int des;
        
        Edge(int src, int des) {
            this.src = src;
            this.des = des;
        }
    }
    
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        List<Integer>[] adjacencyList = new List[n];
        
        // Initialize adjacency list
        for (int i = 0; i < n; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        
        // Populate adjacency list with edges
        for (int[] edge : edges) {
            int src = edge[0];
            int des = edge[1];
            adjacencyList[src].add(des);
            adjacencyList[des].add(src);
        }
        
        int[] distances = new int[n];
        int[] counts = new int[n];
        
        // Calculate distances and counts using DFS
        dfs(0, -1, adjacencyList, distances, counts);
        
        // Calculate sum of distances for each node
        int[] result = new int[n];
        result[0] = distances[0];
        calculateSumOfDistances(0, -1, adjacencyList, distances, counts, result, n);
        
        return result;
    }
    
    private void dfs(int node, int parent, List<Integer>[] adjacencyList, int[] distances, int[] counts) {
        for (int neighbor : adjacencyList[node]) {
            if (neighbor != parent) {
                dfs(neighbor, node, adjacencyList, distances, counts);
                distances[node] += distances[neighbor] + counts[neighbor];
                counts[node] += counts[neighbor];
            }
        }
        counts[node]++;
    }
    
    private void calculateSumOfDistances(int node, int parent, List<Integer>[] adjacencyList, int[] distances, int[] counts, int[] result, int n) {
        for (int neighbor : adjacencyList[node]) {
            if (neighbor != parent) {
                result[neighbor] = result[node] - counts[neighbor] + (n - counts[neighbor]);
                calculateSumOfDistances(neighbor, node, adjacencyList, distances, counts, result, n);
            }
        }
    }
}
