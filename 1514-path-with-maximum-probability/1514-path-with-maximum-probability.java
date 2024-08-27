import java.util.*;

class Solution {

    public class Edge {
        int des;
        double prob;

        Edge(int des, double prob) {
            this.des = des;
            this.prob = prob;
        }
    }

    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Build the graph
        for (int i = 0; i < edges.length; i++) {
            int src = edges[i][0];
            int des = edges[i][1];
            double prob = succProb[i];
            graph[src].add(new Edge(des, prob));
            graph[des].add(new Edge(src, prob));
        }

        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[1], a[1]));
        pq.add(new double[]{start_node, 1.0}); 
        
        double[] maxProb = new double[n];
        maxProb[start_node] = 1.0;

        while (!pq.isEmpty()) {
            double[] current = pq.poll();
            int node = (int) current[0];
            double prob = current[1];

            
            if (node == end_node) {
                return prob;
            }

            
            for (Edge edge : graph[node]) {
                double newProb = prob * edge.prob;
                if (newProb > maxProb[edge.des]) {
                    maxProb[edge.des] = newProb;
                    pq.add(new double[]{edge.des, newProb});
                }
            }
        }

        return 0.0;
    }

    
}
