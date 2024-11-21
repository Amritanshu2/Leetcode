class Solution {
    
    int[][] place;
    
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        place = new int[m][n];
        
        for (int i = 0; i < walls.length; i++) {
            place[walls[i][0]][walls[i][1]] = -1;
        }

        for (int i = 0; i < guards.length; i++) {
            place[guards[i][0]][guards[i][1]] = 1;
        }

        for (int i = 0; i < guards.length; i++) {
            int x = guards[i][0];
            int y = guards[i][1];
            
            for (int j = x + 1; j < m; j++) {
                if (place[j][y] == -1 || place[j][y] == 1) break;
                place[j][y] = 2; 
            }
            for (int j = x - 1; j >= 0; j--) {
                if (place[j][y] == -1 || place[j][y] == 1) break;
                place[j][y] = 2;
            }
            for (int j = y - 1; j >= 0; j--) {
                if (place[x][j] == -1 || place[x][j] == 1) break;
                place[x][j] = 2;
            }
            for (int j = y + 1; j < n; j++) {
                if (place[x][j] == -1 || place[x][j] == 1) break;
                place[x][j] = 2;
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (place[i][j] == 0) { 
                    count++;
                }
            }
        }
        return count;
    }
}
