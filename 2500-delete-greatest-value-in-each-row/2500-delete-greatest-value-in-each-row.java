class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int i = 0;i<grid.length;i++){
            Arrays.sort(grid[i]);
        }
        int sum = 0;
        for(int i = 0;i<grid[0].length;i++){
            int a = 0;
            for(int j = 0;j<grid.length;j++){
                a = Math.max(grid[j][i],a);
            }
            sum += a;
        }
        return sum;
    }
}