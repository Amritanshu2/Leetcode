class Solution {
    
    
    public class Edge {
        int dest;
        Edge(int dest) {
            this.dest = dest;
        }
    }

    Set<Integer> visited = new HashSet<>();
    int redundantConnections = 0;

    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }

        // Construct the graph using adjacency list
        List<Edge>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] connection : connections) {
            graph[connection[0]].add(new Edge(connection[1]));
            graph[connection[1]].add(new Edge(connection[0]));
        }

        int connectedComponents = 0;
        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                dfs(graph, i, -1);
                connectedComponents++;
            }
        }

        return (connectedComponents - 1 <= redundantConnections) ? connectedComponents - 1 : -1;
    }

    // Depth First Search to traverse the graph
    public void dfs(List<Edge>[] graph, int src, int parent) {
        if (visited.contains(src)) {
            redundantConnections++;
            return;
        }
        visited.add(src);
        for (Edge edge : graph[src]) {
            if (edge.dest != parent) {
               dfs(graph, edge.dest, src);
            }
        }
    }
}