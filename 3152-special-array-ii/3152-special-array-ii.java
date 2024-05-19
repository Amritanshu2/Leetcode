class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] ans = new boolean[queries.length];
        int n = nums.length;
        int[] changes = new int[n];

        for (int i = 1; i < n; i++) {
            if ((nums[i] % 2) != (nums[i - 1] % 2)) {
                changes[i] = changes[i - 1] + 1;
            } else {
                changes[i] = changes[i - 1];
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            if (start == end) {
                ans[i] = true; 
            } else {
                ans[i] = (changes[end] - changes[start]) == (end - start);
            }
        }

        return ans;
    }
}