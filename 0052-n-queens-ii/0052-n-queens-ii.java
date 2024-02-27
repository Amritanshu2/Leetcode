import java.util.*;

class Solution {
    int count = 0;
    
    public int totalNQueens(int n) {
        count = 0;
        Set<Integer> columns = new HashSet<>();
        Set<Integer> diag1 = new HashSet<>();
        Set<Integer> diag2 = new HashSet<>();
        check(n, columns, diag1, diag2, 0);
        return count;
    }
    
    private void check(int n, Set<Integer> columns, Set<Integer> diag1, Set<Integer> diag2, int row) {
        if (row == n) {
            count++;
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (columns.contains(col) || diag1.contains(row + col) || diag2.contains(row - col)) {
                continue;
            }
            
            columns.add(col);
            diag1.add(row + col);
            diag2.add(row - col);
            
            check(n, columns, diag1, diag2, row + 1);
            
            columns.remove(col);
            diag1.remove(row + col);
            diag2.remove(row - col);
        }
    }
}
