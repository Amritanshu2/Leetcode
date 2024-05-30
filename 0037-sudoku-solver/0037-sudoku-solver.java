import java.util.HashSet;

class Solution {

    public class Store {
        HashSet<Integer> hm;

        Store() {
            this.hm = new HashSet<>();
        }
    }

    Store[] stores = new Store[9];

    int[][] arr;
    int[][] ans;

    public Solution() {
        // Initialize the stores array with Store objects
        for (int i = 0; i < 9; i++) {
            stores[i] = new Store();
        }
    }

    public void solveSudoku(char[][] board) {
        arr = new int[board.length][board[0].length];
        ans = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    arr[i][j] = board[i][j] - '0';
                    int storeIndex = 3 * (i / 3) + j / 3;
                    stores[storeIndex].hm.add(arr[i][j]);
                }
            }
        }

        sudoku(0, 0);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    board[i][j] = (char) ('0' + ans[i][j]);
                }
            }
        }
    }

    public boolean sudoku(int row, int col) {
        if (row == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                ans[i] = arr[i].clone();
            }
            return true;
        }

        if (col == arr[0].length) {
            return sudoku(row + 1, 0);
        }

        if (arr[row][col] != 0) {
            return sudoku(row, col + 1);
        }

        int storeIndex = 3 * (row / 3) + col / 3;

        for (int num = 1; num <= 9; num++) {
            if (!stores[storeIndex].hm.contains(num) && check(arr, row, col, num)) {
                stores[storeIndex].hm.add(num);
                arr[row][col] = num;
                if (sudoku(row, col + 1)) {
                    return true;
                }
                stores[storeIndex].hm.remove(num);
                arr[row][col] = 0;
            }
        }

        return false;
    }

    public boolean check(int board[][], int i1, int j1, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][j1] == num || board[i1][i] == num) {
                return false;
            }
        }
        return true;
    }
}
