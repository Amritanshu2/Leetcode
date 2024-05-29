class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, i, j, 0, word, new boolean[board.length][board[0].length])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int i, int j, int pos, String word, boolean[][] visited) {
        if (pos == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(pos) || visited[i][j]) {
            return false;
        }
        
        visited[i][j] = true;
        boolean exists = dfs(board, i - 1, j, pos + 1, word, visited) ||
                         dfs(board, i + 1, j, pos + 1, word, visited) ||
                         dfs(board, i, j - 1, pos + 1, word, visited) ||
                         dfs(board, i, j + 1, pos + 1, word, visited);
        visited[i][j] = false;
        return exists;
    }
}
