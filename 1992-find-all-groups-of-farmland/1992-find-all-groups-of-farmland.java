import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] findFarmland(int[][] nums) {
        List<int[]> result = new ArrayList<>();

        int m = nums.length;
        int n = nums[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i][j] == 1) {
                    int rowEnd = i;
                    int colEnd = j;

                    while (rowEnd < m && nums[rowEnd][j] == 1) {
                        rowEnd++;
                    }
                    while (colEnd < n && nums[i][colEnd] == 1) {
                        colEnd++;
                    }

                    for (int x = i; x < rowEnd; x++) {
                        for (int y = j; y < colEnd; y++) {
                            nums[x][y] = 0;
                        }
                    }

                    result.add(new int[]{i, j, rowEnd - 1, colEnd - 1});
                }
            }
        }

        return result.toArray(new int[0][]);
    }
}
