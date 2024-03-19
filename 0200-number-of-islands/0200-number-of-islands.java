import java.util.HashSet;

class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int num = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    num++;
                    dfs(grid, visited, i, j);
                }
            }
        }

        return num;
    }

    private void dfs(char[][] grid, boolean[][] visited, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0' || visited[row][col]) {
            return;
        }

        visited[row][col] = true;

        dfs(grid, visited, row + 1, col); 
        dfs(grid, visited, row - 1, col); 
        dfs(grid, visited, row, col + 1); 
        dfs(grid, visited, row, col - 1); 
    }
}
