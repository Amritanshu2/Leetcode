import java.util.Arrays;

class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> a[0] - b[0]);

        int max = 0;
        for (int i = 0; i < items.length; i++) {
            max = Math.max(items[i][1], max);
            items[i][1] = max;
        }

        for (int i = 0; i < queries.length; i++) {
            int s = 0, end = items.length - 1;
            int num = 0;

            while (s <= end) {
                int mid = (s + end) / 2;

                if (items[mid][0] <= queries[i]) {
                    num = items[mid][1];
                    s = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            queries[i] = num;
        }

        return queries;
    }
}
