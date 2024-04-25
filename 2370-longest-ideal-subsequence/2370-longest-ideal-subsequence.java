class Solution {
    public int longestIdealString(String s, int k) {
        int[][] memo = new int[s.length()][256]; // Using 256 as the second dimension for ASCII characters
        return dfs(s, k, 0, '\0', memo);
    }
    
    private int dfs(String s, int k, int index, char prev, int[][] memo) {
        if (index == s.length())
            return 0;
        
        if (memo[index][prev] != 0)
            return memo[index][prev];
        
        int includeCurr = 0;
        if (prev == '\0' || Math.abs(s.charAt(index) - prev) <= k)
            includeCurr = 1 + dfs(s, k, index + 1, s.charAt(index), memo);
        
        int skipCurr = dfs(s, k, index + 1, prev, memo);
        
        int maxLen = Math.max(includeCurr, skipCurr);
        memo[index][prev] = maxLen;
        return maxLen;
    }
}
