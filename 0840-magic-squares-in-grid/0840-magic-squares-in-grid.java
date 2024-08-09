class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        if (grid.length < 3 || grid[0].length < 3) {
            return 0;
        }
        
        int count = 0;
        
        for (int i = 0; i <= grid.length - 3; i++) {
            for (int j = 0; j <= grid[0].length - 3; j++) {
                if (isMagicSquare(grid, i, j)) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private boolean isMagicSquare(int[][] grid, int row, int col) {
        int[] nums = new int[9];
        int index = 0;
        
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                nums[index++] = grid[i][j];
            }
        }
        
        boolean[] seen = new boolean[10]; 
        for (int num : nums) {
            if (num < 1 || num > 9 || seen[num]) {
                return false;
            }
            seen[num] = true;
        }
        
        int sum = nums[0] + nums[1] + nums[2];
        
        for (int i = 0; i < 3; i++) {
            if (nums[i * 3] + nums[i * 3 + 1] + nums[i * 3 + 2] != sum) {
                return false;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            if (nums[i] + nums[i + 3] + nums[i + 6] != sum) {
                return false;
            }
        }
        
        if (nums[0] + nums[4] + nums[8] != sum) {
            return false;
        }
        if (nums[2] + nums[4] + nums[6] != sum) {
            return false;
        }
        
        return true;
    }
}
