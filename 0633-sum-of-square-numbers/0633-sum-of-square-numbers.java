class Solution {
    public boolean judgeSquareSum(int c) {
        if (c == 0 || c == 1) {
            return true;
        }
        int i = 0;
        long j = (long)Math.sqrt(c);
        while (i <= j) {
            if (i*i + j*j == c) {
                return true;
            }
            if (i*i + j*j < c) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
