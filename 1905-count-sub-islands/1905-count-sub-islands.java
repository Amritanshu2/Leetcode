import java.util.HashSet;

class Solution {
    int numIs = 0;
    HashSet<String> hs = new HashSet<>();

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[i].length; j++) {
                if (grid2[i][j] == 1 && !hs.contains(i + " " + j)) {
                   
                    if (check(i, j, grid1, grid2)) {
                        numIs++;
                    }
                }
            }
        }
        return numIs;
    }

    public boolean check(int i, int j, int[][] arr1, int[][] arr2) {
       
        if (i < 0 || i >= arr2.length || j < 0 || j >= arr2[0].length) {
            return true;
        }
       
        if (arr2[i][j] == 0 || hs.contains(i + " " + j)) {
            return true;
        }

        
        hs.add(i + " " + j);

       
        boolean ans = arr1[i][j] == 1;

       
        boolean up = check(i - 1, j, arr1, arr2);
        boolean down = check(i + 1, j, arr1, arr2);
        boolean left = check(i, j - 1, arr1, arr2);
        boolean right = check(i, j + 1, arr1, arr2);

        
        return ans && up && down && left && right;
    }
}
