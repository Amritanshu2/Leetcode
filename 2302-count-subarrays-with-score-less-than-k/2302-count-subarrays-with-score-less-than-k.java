class Solution {
    public long countSubarrays(int[] nums, long k) {
        int left = 0, right = 0;
        long total = 0;
        long count = 0;

        while (right < nums.length) {
            total += nums[right];

            while ((total)*(right-left+1) >= k && left <= right) {
                total -= nums[left];
                left++;
            }

            count += right-left+1;
            right++;
        }

        return count;
    }
}
