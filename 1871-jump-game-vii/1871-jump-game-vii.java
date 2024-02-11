
    
   class Solution {

    public boolean dfs(int curIdx, int n, String binaryStr, int minJump, int maxJump, Boolean[] dp) {

        if (curIdx == n - 1) {
            return true;
        }

        if (curIdx >= n) {
            return false;
        }

        if (dp[curIdx] != null) {
            return dp[curIdx];
        }

        for (int nextJumpIdx = curIdx + minJump; nextJumpIdx <= curIdx + maxJump; nextJumpIdx++) {
            if (dfs(nextJumpIdx, n, binaryStr, minJump, maxJump, dp)) {
                dp[curIdx] = true;
                return true;
            }
        }

        dp[curIdx] = false;
        return false;
    }

    public boolean canReach(String binaryStr, int minJump, int maxJump) {

        int n = binaryStr.length();

        if (binaryStr.charAt(n - 1) == '1') {
            return false;
        }

        Boolean[] dp = new Boolean[n];

        int consec1sCount = 0;

        for (int i = 0; i < n; i++) {
            if (binaryStr.charAt(i) == '1') {
                consec1sCount++;
                dp[i] = false;
                if (consec1sCount >= maxJump) {
                    return false;
                }
            } else {
                consec1sCount = 0;
            }
        }

        return dfs(0, n, binaryStr, minJump, maxJump, dp);
    }
}
