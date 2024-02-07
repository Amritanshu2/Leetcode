class Solution {
    boolean a = false;
    boolean[] visited;

    public boolean canReach(int[] nums, int start) {
        visited = new boolean[nums.length];
        jump(nums, start);
        return a;
    }

    public void jump(int[] nums, int j) {
        if (j >= nums.length || j < 0 || visited[j]) {
            return;
        }
        visited[j] = true;
        if (nums[j] == 0) {
            a = true;
            return;
        }
        jump(nums, j - nums[j]);
        jump(nums, j + nums[j]);
    }
}
