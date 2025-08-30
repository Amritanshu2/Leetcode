class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[]cols = new HashSet[9];
        HashSet<Character>[]rows = new HashSet[9];
        HashSet<Character>[][]boxes = new HashSet[3][3];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boxes[i][j] = new HashSet<>();
            }
        }

        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j] != '.'){
                    if(cols[j].contains(board[i][j]) || rows[i].contains(board[i][j]) || boxes[i/3][j/3].contains(board[i][j])){return false;}
                }
                rows[i].add(board[i][j]);
                cols[j].add(board[i][j]);
                boxes[i/3][j/3].add(board[i][j]);
            }
        }
        return true;
    }

}