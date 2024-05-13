class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = nums[0];
        int minSum = nums[0];
        int curMax = 0;
        int curMin = 0;
        
        for (int num : nums) {
            totalSum += num;
            curMax = Math.max(curMax + num, num);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + num, num);
            minSum = Math.min(minSum, curMin);
        }
        
        // If all numbers are negative, return the maximum subarray sum
        if (maxSum < 0) {
            return maxSum;
        }
        
        // Handle the circular case
        int circularMax = totalSum - minSum;
        
        return Math.max(maxSum, circularMax);
    }
}