class Solution {
    long MOD = 1000000007;
    long[][][] nums;
    
    public int checkRecord(int n) {
        nums = new long[n][3][2];
        return (int)okay(n,0,0,0);
    }
    
    public long okay(int n, int i, int late, int abs) {
        if (i == n) {
            return 1;
        }
        if (nums[i][late][abs] != 0) {
            return nums[i][late][abs];
        }
        
        long a = okay(n, i + 1, 0, abs);
        long b = 0;
        long c = 0;
        
        if (abs < 1) {
            b = okay(n, i + 1, 0, abs + 1);
        }
        
        if (late < 2) {
            c = okay(n, i + 1, late + 1, abs);
        }
        
        nums[i][late][abs] = (a + b + c) % MOD;
        return nums[i][late][abs];
    }
}
