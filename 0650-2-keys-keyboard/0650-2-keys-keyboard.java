class Solution {
    public int minSteps(int n) {
        if (n == 1) {
            return 0; 
        }
        return check(n, 1, 1)+1;
    }
    
    public int check(int n, int len, int wl) {
        if (len == n) {
            return 0; 
        }
        if (len > n) {
            return (int) 1e8;
        }
        int paste = check(n, len + wl, wl) + 1;
        int copyAndPaste = check(n, len * 2, len) + 2;
        return Math.min(paste, copyAndPaste);
    }
}
