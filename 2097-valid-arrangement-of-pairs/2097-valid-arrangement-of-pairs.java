import java.util.*;

class Solution {
    public int[][] validArrangement(int[][] pairs) {
        Map<Integer, Queue<Integer>> adjacencyList = new HashMap<>();
        Map<Integer, Integer> degreeMap = new HashMap<>();

        for (int[] pair : pairs) {
            int from = pair[0], to = pair[1];
            adjacencyList.computeIfAbsent(from, k -> new LinkedList<>()).offer(to);
            degreeMap.put(from, degreeMap.getOrDefault(from, 0) + 1); 
            degreeMap.put(to, degreeMap.getOrDefault(to, 0) - 1);     
        }

        
        int startNode = pairs[0][0];
        for (int node : degreeMap.keySet()) {
            if (degreeMap.get(node) == 1) {
                startNode = node;
                break;
            }
        }

        LinkedList<int[]> resultPath = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(startNode);

        while (!stack.isEmpty()) {
            int current = stack.peek();
            Queue<Integer> neighbors = adjacencyList.getOrDefault(current, new LinkedList<>());

            if (!neighbors.isEmpty()) {
                stack.push(neighbors.poll()); 
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    resultPath.addFirst(new int[]{stack.peek(), current});
                }
            }
        }
        return resultPath.toArray(new int[resultPath.size()][]);
    }
}