import java.util.*;

class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return Collections.singletonList(0);

        List<Set<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new HashSet<>());
        }

        for (int[] edge : edges) {
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> leaves = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (adjacencyList.get(i).size() == 1) {
                leaves.offer(i);
            }
        }

        while (n > 2) {
            int leavesSize = leaves.size();
            n -= leavesSize;
            for (int i = 0; i < leavesSize; i++) {
                int leaf = leaves.poll();
                int neighbor = adjacencyList.get(leaf).iterator().next();
                adjacencyList.get(neighbor).remove(leaf);
                if (adjacencyList.get(neighbor).size() == 1) {
                    leaves.offer(neighbor);
                }
            }
        }

        return new ArrayList<>(leaves);
    }
}
