public class Solution {
    public int[] factorial(int n) {
        int[] factors = new int[2]; // Index 0 for factor 2 count, index 1 for factor 5 count

        while (n > 0) {
            factors[0] += countFactors(n, 2);
            factors[1] += countFactors(n, 5);
            n--;
        }

        return factors;
    }

    public int countFactors(int n, int factor) {
        int count = 0;
        while (n % factor == 0) {
            count++;
            n /= factor;
        }
        return count;
    }

    public int trailingZeroes(int n) {
        int[] factors = factorial(n);
        return Math.min(factors[0], factors[1]);
    }
}
