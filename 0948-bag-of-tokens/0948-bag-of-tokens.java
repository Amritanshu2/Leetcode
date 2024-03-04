class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        int ans = 0;
        
        if (n == 1) {
            return power >= tokens[0] ? 1 : 0;
        }
        
        Arrays.sort(tokens);
        int low = 0, high = n - 1;
        
        while (low <= high) {
            if (power >= tokens[low]) {
                power -= tokens[low++];
                ans++;
            } else if (ans > 0 && high > low) {
                power += tokens[high--];
                ans--;
            } else {
                break;
            }
        }
        
        return ans;
    }}