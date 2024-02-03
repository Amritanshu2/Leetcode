import java.util.Arrays;

class Solution {

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        
        // Find the first pair of two successive numbers nums[i] and nums[i+1]
        // from the right, which satisfy nums[i] < nums[i+1].
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Find the smallest number to the right of nums[i] but larger than nums[i]
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Swap nums[i] and the smallest larger number to its right
            swap(nums, i, j);
        }

        // Reverse the subarray to the right of nums[i]
        reverse(nums, i + 1, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
