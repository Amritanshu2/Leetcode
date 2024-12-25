class Solution {
    Boolean[][][] dp; 
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length()) {
            return false;
        }

        dp = new Boolean[s3.length()+1][s1.length()+1][s2.length()+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                Arrays.fill(dp[i][j], null); 
            }
        }
        return check(0, 0, 0, s1, s2, s3);
    }

    public boolean check(int pos, int ps1, int ps2, String s1, String s2, String s3) {
        if (pos == s3.length()) {
            return true; 
        }

        if (dp[pos][ps1][ps2] != null) {
            return dp[pos][ps1][ps2];
        }

        if (ps1 < s1.length() && ps2 < s2.length() && s1.charAt(ps1) == s2.charAt(ps2)) {
            if (s1.charAt(ps1) != s3.charAt(pos)) {
                return dp[pos][ps1][ps2] = false;
            } else {
                return dp[pos][ps1][ps2] = check(pos + 1, ps1 + 1, ps2, s1, s2, s3) ||
                                           check(pos + 1, ps1, ps2 + 1, s1, s2, s3);
            }
        } else if (ps1 < s1.length() && s1.charAt(ps1) == s3.charAt(pos)) {
            return dp[pos][ps1][ps2] = check(pos + 1, ps1 + 1, ps2, s1, s2, s3);
        } else if (ps2 < s2.length() && s2.charAt(ps2) == s3.charAt(pos)) {
            return dp[pos][ps1][ps2] = check(pos + 1, ps1, ps2 + 1, s1, s2, s3);
        }
        return dp[pos][ps1][ps2] = false;
    }
}
