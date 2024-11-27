import java.util.*;

public class Solution {

    public class Graph {
        int src;
        int des;
        Graph(int src, int des) {
            this.src = src;
            this.des = des;
        }
    }

    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        List<Graph> list[] = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
            if (i < n - 1) {
                list[i].add(new Graph(i, i + 1));
            }
        }

        int[] ans = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            list[queries[i][0]].add(new Graph(queries[i][0], queries[i][1]));
            ans[i] = bfs(list, 0, n - 1);
        }
        
        return ans;
    }
    
    private int bfs(List<Graph> arr[], int src, int des) {
        boolean[] visited = new boolean[arr.length];
        Queue<Integer> queue = new LinkedList<>();
        int[] distance = new int[arr.length];
        
        Arrays.fill(distance, Integer.MAX_VALUE);
        queue.offer(src);
        visited[src] = true;
        distance[src] = 0;
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            
            for (Graph neighbor : arr[node]) {
                if (!visited[neighbor.des]) {
                    visited[neighbor.des] = true;
                    queue.offer(neighbor.des);
                    distance[neighbor.des] = distance[node] + 1;
                }
            }
        }
        
        return distance[des] == Integer.MAX_VALUE ? -1 : distance[des];
    }
}
