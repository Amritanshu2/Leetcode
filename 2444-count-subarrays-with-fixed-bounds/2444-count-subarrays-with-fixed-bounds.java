class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int i = 0;
        int minIndex = -1;
        int maxIndex = -1;
        long total = 0;
        int minKCount = 0;
        int maxKCount = 0;

        // Iterate over the nums array
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] < minK || nums[j] > maxK) {
                i = j + 1;
                minIndex = -1;
                maxIndex = -1;
                minKCount = 0;
                maxKCount = 0;
            }

            if (nums[j] == minK) {
                minIndex = j;
                minKCount++;
            }

            if (nums[j] == maxK) {
                maxIndex = j;
                maxKCount++;
            }

            if (minIndex != -1 && maxIndex != -1) {
                total += (long) Math.min(minIndex, maxIndex) - i + 1;
            }
        }

        return total;
    }
}