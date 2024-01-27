class Solution {
    int mod = 1000000007;

    public int kInversePairs(int n, int k) {
        // using memoization technique
        int[] arr = new int[k + 1];
        for (int i = 1; i <= n; i++) {
            int[] prow = new int[k + 1];
            prow[0] = 1;
            for (int j = 1; j <= k; j++) {
                int var = (arr[j] + mod - (j - i >= 0 ? arr[j - i] : 0)) % mod;
                prow[j] = (prow[j - 1] + var) % mod;
            }
            arr = prow;
        }
        return (arr[k] + mod - (k > 0 ? arr[k - 1] : 0)) % mod;
    }
}
