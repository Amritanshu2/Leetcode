class Solution {
    int MOD = 1_000_000_007;

    public int[] pathsWithMaxScore(List<String> board) {
        int n = board.size();
        int[][] maxSum = new int[n][n];
        int[][] ways = new int[n][n];
        
        for (int[] row : maxSum) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }

        maxSum[n - 1][n - 1] = 0;
        ways[n - 1][n - 1] = 1;
        
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (board.get(i).charAt(j) == 'X' || (i == n - 1 && j == n - 1)) {
                    continue;
                }

                int currentVal = (board.get(i).charAt(j) == 'S' || board.get(i).charAt(j) == 'E') ? 0 : board.get(i).charAt(j) - '0';

                if (i + 1 < n && maxSum[i + 1][j] != Integer.MIN_VALUE) {
                    update(maxSum, ways, i, j, i + 1, j, currentVal);
                }
                if (j + 1 < n && maxSum[i][j + 1] != Integer.MIN_VALUE) {
                    update(maxSum, ways, i, j, i, j + 1, currentVal);
                }
                if (i + 1 < n && j + 1 < n && maxSum[i + 1][j + 1] != Integer.MIN_VALUE) {
                    update(maxSum, ways, i, j, i + 1, j + 1, currentVal);
                }
            }
        }

        int maxScore = maxSum[0][0];
        int numOfWays = ways[0][0];
        
        if (maxScore == Integer.MIN_VALUE) {
            return new int[]{0, 0};
        } else {
            return new int[]{maxScore, numOfWays};
        }
    }

    private void update(int[][] maxSum, int[][] ways, int i, int j, int ni, int nj, int currentVal) {
        int newSum = maxSum[ni][nj] + currentVal;

        if (newSum > maxSum[i][j]) {
            maxSum[i][j] = newSum;
            ways[i][j] = ways[ni][nj];
        } else if (newSum == maxSum[i][j]) {
            ways[i][j] = (ways[i][j] + ways[ni][nj]) % MOD;
        }
    }
}