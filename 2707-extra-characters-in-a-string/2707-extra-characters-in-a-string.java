class Solution {
    HashSet<String> hs = new HashSet<>();
    int[] dp;

    public int minExtraChar(String s, String[] dictionary) {
        dp = new int[s.length()];
        Arrays.fill(dp, -1);  
        for (String word : dictionary) {
            hs.add(word);
        }
        return check(s, 0);
    }

    public int check(String s, int idx) {
        if (idx == s.length()) {
            return 0;
        }
        if (dp[idx] != -1) {
            return dp[idx];
        }
        String temp = "";
        int min = (int) 1e8;
        for (int i = idx; i < s.length(); i++) {
            temp += s.charAt(i);
            if (hs.contains(temp)) {
                min = Math.min(min, check(s, i + 1));
            } else {
                min = Math.min(min, check(s, i + 1) + temp.length());
            }
        }
        return dp[idx] = min;
    }
}
