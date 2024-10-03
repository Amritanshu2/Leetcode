import java.util.HashMap;

class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long remainder = totalSum % p;
        if (remainder == 0) {
            return 0;  
        }

        HashMap<Long, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0L, -1);  
        long prefixSum = 0;
        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            long currentRemainder = prefixSum % p;

            long targetRemainder = (currentRemainder - remainder + p) % p;

            if (remainderMap.containsKey(targetRemainder)) {
                minLength = Math.min(minLength, i - remainderMap.get(targetRemainder));
            }

            remainderMap.put(currentRemainder, i);
        }

        return minLength == nums.length ? -1 : minLength;
    }
}
