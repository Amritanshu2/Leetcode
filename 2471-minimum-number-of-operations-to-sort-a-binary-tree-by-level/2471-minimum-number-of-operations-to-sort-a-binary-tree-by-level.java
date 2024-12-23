import java.util.*;

class Solution {
    HashMap<Integer, List<Integer>> hm = new HashMap<>();

    public int minimumOperations(TreeNode root) {
        if (root == null) return 0;

        hlpr(root, 0);

        int cnt = 0;

        for (Map.Entry<Integer, List<Integer>> entry : hm.entrySet()) {
            cnt += minSwaps(entry.getValue());
        }

        return cnt;
    }

    public static int minSwaps(List<Integer> nums) {
        int n = nums.size();

        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(nums.get(i), i);
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a.value));

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i].index == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = arr[j].index;
                cycleSize++;
            }

            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }

        return swaps;
    }

    static class Pair {
        int value, index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public void hlpr(TreeNode root, int height) {
        if (root == null) return;

        hlpr(root.left, height + 1);
        hm.computeIfAbsent(height, k -> new ArrayList<>()).add(root.val);
        hlpr(root.right, height + 1);
    }
}
