class Solution {
    int[][] trav;

    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;

        int rows = board.length;
        int cols = board[0].length;

        trav = new int[rows][cols];

        // Traverse the borders and mark connected 'O's as visited
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O' && trav[i][0] != 1) {
                check(board, i, 0);
            }
            if (board[i][cols - 1] == 'O' && trav[i][cols - 1] != 1) {
                check(board, i, cols - 1);
            }
        }
        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O' && trav[0][j] != 1) {
                check(board, 0, j);
            }
            if (board[rows - 1][j] == 'O' && trav[rows - 1][j] != 1) {
                check(board, rows - 1, j);
            }
        }

        // Traverse the whole board and convert surrounded 'O's to 'X's
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O' && trav[i][j] != 1) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void check(char[][] arr, int i, int j) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Base cases: check if current cell is out of bounds or already visited
        if (i < 0 || j < 0 || i >= rows || j >= cols || arr[i][j] == 'X' || trav[i][j] == 1) {
            return;
        }

        // Mark current cell as visited
        trav[i][j] = 1;

        // Recursively check neighboring cells
        check(arr, i + 1, j); // Down
        check(arr, i - 1, j); // Up
        check(arr, i, j + 1); // Right
        check(arr, i, j - 1); // Left
    }
}
