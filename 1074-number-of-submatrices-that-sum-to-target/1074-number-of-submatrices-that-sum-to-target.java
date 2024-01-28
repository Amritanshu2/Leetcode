import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numSubmatrixSumTarget(int[][] nums, int target) {
        int total = 0;
        int rows = nums.length;
        int cols = nums[0].length;

        for (int i = 0; i < rows; i++) {
            int[] arr = new int[cols];
            for (int j = i; j < rows; j++) {
                for (int j1 = 0; j1 < cols; j1++) {
                    arr[j1] += nums[j][j1];
                }
                total += subarraySum(arr, target);
            }
        }
        return total;
    }

    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
