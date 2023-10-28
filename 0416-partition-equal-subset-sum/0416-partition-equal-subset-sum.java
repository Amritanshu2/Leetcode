

public class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        return s(nums, sum / 2, 0);
    }

    public boolean s(int nums[], int sum, int ss) {
        boolean arr[][] = new boolean[nums.length + 1][sum + 1];
        for (int i = 0; i < nums.length + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    arr[i][j] = false;
                }
                if (j == 0) {
                    arr[i][j] = true;
                } else if (i > 0 && nums[i - 1] <= j) {
                    arr[i][j] = arr[i - 1][j - nums[i - 1]] || arr[i - 1][j];
                } else if (i > 0 && nums[i - 1] > j) {
                    arr[i][j] = arr[i - 1][j];
                }
            }
        }
        return arr[nums.length][sum];
    }
}
