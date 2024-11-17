class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
    if (nums.size() < 2 * k) return false;

    for (int i = 0; i <= nums.size() - 2 * k; i++) {
        boolean isValid = true;

        for (int j = 0; j < k - 1; j++) {
            if (nums.get(i + j) >= nums.get(i + j + 1) || nums.get(i + k + j) >= nums.get(i + k + j + 1)) {
                isValid = false;
                break;
            }
        }

        if (isValid) return true;
    }

    return false;
}

}