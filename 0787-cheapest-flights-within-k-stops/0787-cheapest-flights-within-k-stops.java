import java.util.*;

class Solution {
    HashMap<Integer, List<List<Integer>>> hm = new HashMap<>();
    HashMap<String, Integer> memo = new HashMap<>();

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        for (int i = 0; i < flights.length; i++) {
            if (!hm.containsKey(flights[i][0])) {
                hm.put(flights[i][0], new ArrayList<>());
            }
            hm.get(flights[i][0]).add(Arrays.asList(flights[i][1], flights[i][2]));
        }

        int result = far(k + 1, src, dst); // Increment k by 1 since it represents the number of stops, not remaining stops
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public int far(int k, int src, int dst) {
        if (k < 0) {
            return Integer.MAX_VALUE;
        }
        if (src == dst) {
            return 0;
        }
        String key = src + "-" + dst + "-" + k;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (!hm.containsKey(src)) {
            return Integer.MAX_VALUE;
        }
        List<List<Integer>> al = hm.get(src);
        int sm = Integer.MAX_VALUE;
        for (List<Integer> as : al) {
            int nextPrice = far(k - 1, as.get(0), dst);
            if (nextPrice != Integer.MAX_VALUE) {
                sm = Math.min(sm, nextPrice + as.get(1));
            }
        }
        memo.put(key, sm);
        return sm;
    }
}
