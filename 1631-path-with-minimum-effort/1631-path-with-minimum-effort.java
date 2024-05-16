import java.util.*;

class Solution {
    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    
    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        int[][] efforts = new int[rows][cols];
        for (int[] row : efforts) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        efforts[0][0] = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        pq.offer(new int[]{0, 0, 0}); // {row, col, effort}
        
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int x = current[0], y = current[1], currentEffort = current[2];
            
            if (x == rows - 1 && y == cols - 1) {
                return currentEffort;
            }
            
            for (int[] dir : DIRECTIONS) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                
                if (newX >= 0 && newX < rows && newY >= 0 && newY < cols) {
                    int nextEffort = Math.max(currentEffort, Math.abs(heights[x][y] - heights[newX][newY]));
                    if (nextEffort < efforts[newX][newY]) {
                        efforts[newX][newY] = nextEffort;
                        pq.offer(new int[]{newX, newY, nextEffort});
                    }
                }
            }
        }
        
        return 0; // Should never be reached if input is valid
    }
}
