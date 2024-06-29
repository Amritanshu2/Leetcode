import java.util.HashMap;

class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> remainderCount = new HashMap<>();
        
        // Count frequencies of remainders
        for (int num : arr) {
            int remainder = ((num % k) + k) % k; // Ensure non-negative remainders
            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }
        
        for (int remainder : remainderCount.keySet()) {
            if (remainder == 0) {
                if (remainderCount.get(remainder) % 2 != 0) return false;
            } else {
                int complement = k - remainder;
                if (remainder == complement) {
                    if (remainderCount.get(remainder) % 2 != 0) return false;
                } else {
                    if (!remainderCount.get(remainder).equals(remainderCount.getOrDefault(complement, 0))) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}
