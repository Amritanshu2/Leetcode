import java.util.*;

public class Solution {

    private void dfs(Map<Integer, List<Pair<Integer, Integer>>> adj, int u, boolean[] visited, int[] result) {
        visited[u] = true;

        for (Pair<Integer, Integer> pair : adj.get(u)) {
            int v = pair.getKey();
            int c = pair.getValue();

            result[0] = Math.min(result[0], c);

            if (!visited[v]) {
                dfs(adj, v, visited, result);
            }
        }
    }

    public int minScore(int n, int[][] roads) {
        Map<Integer, List<Pair<Integer, Integer>>> adj = new HashMap<>();

        for (int[] vec : roads) {
            int u = vec[0];
            int v = vec[1];
            int c = vec[2];

            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(new Pair<>(v, c));
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(new Pair<>(u, c));
        }

        boolean[] visited = new boolean[n + 1];
        int[] result = {Integer.MAX_VALUE};
        dfs(adj, 1, visited, result);

        return result[0];
    }

    
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
