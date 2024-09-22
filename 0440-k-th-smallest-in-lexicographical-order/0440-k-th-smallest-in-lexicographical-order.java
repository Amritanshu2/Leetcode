class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1; 
        k--; 

        while (k > 0) {
            int steps = countSteps(curr, n);
            if (steps <= k) {
                curr++;
                k -= steps; 
            } else {
                curr *= 10; 
                k--; 
            }
        }
        return curr;
    }

    private int countSteps(int curr, int n) {
        long steps = 0;
        long first = curr;
        long last = curr + 1;

        while (first <= n) {
            steps += Math.min(n + 1, last) - first;
            first *= 10; 
            last *= 10; 
        }

        return (int) steps;
    }
}