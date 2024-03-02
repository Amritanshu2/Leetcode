import java.util.HashMap;

class Solution {
    public int numberOfGoodSubarraySplits(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int a = 1;
        int MOD = 1000000007;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (hm.containsKey(nums[i])) {
                    a = (int) ((1L * a * (i - hm.get(1))) % MOD); 
                }
                hm.put(1, i);
            }
        }

        if (!hm.containsKey(1)) {
            return 0;
        }
        return a;
    }
}
