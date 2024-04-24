import java.util.*;

public class Solution {

    public class Graph {
        int src;
        int des;
        int time;

        Graph(int src, int des, int time) {
            this.src = src;
            this.des = des;
            this.time = time;
        }
    }

    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        int n = passingFees.length;
        List<Graph>[] arr = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            arr[edge[0]].add(new Graph(edge[0], edge[1], edge[2]));
            arr[edge[1]].add(new Graph(edge[1], edge[0], edge[2]));
        }

        // Initialize dp array to store minimum cost to reach each node within time limit
        int[][] dp = new int[n][maxTime + 1];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dp[0][0] = passingFees[0];

        // Bottom-up dynamic programming
        for (int time = 0; time <= maxTime; time++) {
            for (int node = 0; node < n; node++) {
                if (dp[node][time] == Integer.MAX_VALUE) continue;
                for (Graph graph : arr[node]) {
                    int nextNode = graph.des;
                    int nextTime = time + graph.time;
                    if (nextTime <= maxTime) {
                        dp[nextNode][nextTime] = Math.min(dp[nextNode][nextTime], dp[node][time] + passingFees[nextNode]);
                    }
                }
            }
        }

        // Find minimum cost to reach destination within maxTime
        int minCost = Integer.MAX_VALUE;
        for (int time = 0; time <= maxTime; time++) {
            minCost = Math.min(minCost, dp[n - 1][time]);
        }

        return minCost == Integer.MAX_VALUE ? -1 : minCost;
    }
}
