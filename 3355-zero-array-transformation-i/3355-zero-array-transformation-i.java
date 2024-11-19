class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] arr = new int[nums.length + 1]; 
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            arr[start] += 1; 
            if (end + 1 < arr.length) {
                arr[end + 1] -= 1; 
            }
        }
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            current += arr[i]; 
            if (nums[i] > current) {
                return false; 
            }
        }
        return true;
    }
}
