import java.util.*;

class Solution {

    public class Edge {
        public int u;
        public int v;

        Edge(int ux, int vx) {
            this.u = ux;
            this.v = vx;
        }
    }

    // DFS to mark the suspicious methods
    public void RemoveMethod(ArrayList<ArrayList<Edge>> graph, int vis[], int k) {
        if (vis[k] == 1) {
            return;
        }

        vis[k] = 1;  // Mark the method as suspicious

        ArrayList<Edge> neighbours = graph.get(k);
        for (Edge e : neighbours) {
            int v = e.v;  // Get the method invoked by method k
            RemoveMethod(graph, vis, v);  // Recursively mark all invoked methods
        }
    }

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        
        // If there are no invocations, return all methods except k
        if (invocations == null || invocations.length == 0) {
            List<Integer> newans0 = new ArrayList<>();
            for (int x = 0; x < n; x++) {
                if (x != k) {
                    newans0.add(x);
                }
            }
            return newans0;
        }

        // Initialize the graph
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Edge>());
        }

        // Build the graph
        for (int i = 0; i < invocations.length; i++) {
            graph.get(invocations[i][0]).add(new Edge(invocations[i][0], invocations[i][1]));
        }

        int vis[] = new int[n];  // Array to mark suspicious methods

        // Perform DFS to mark all suspicious methods starting from k
        RemoveMethod(graph, vis, k);

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {  // If the method is not suspicious
                ArrayList<Edge> neighbours = graph.get(i);

                // Check if any suspicious method is invoked by this method
                for (Edge e : neighbours) {
                    int v = e.v;
                    if (vis[v] != 0) {
                        // If this method invokes a suspicious method, return all methods
                        List<Integer> newans = new ArrayList<>();
                        for (int x = 0; x < n; x++) {
                            newans.add(x);
                        }
                        return newans;
                    }
                }

                ans.add(i);  // Add this method to the result list
            }
        }
        return ans;
    }
}
