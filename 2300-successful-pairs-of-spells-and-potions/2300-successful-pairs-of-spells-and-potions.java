import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length];
        int n = potions.length;

        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];
            int left = 0;
            int right = n - 1;
            int a = n;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                long product = (long) spell * potions[mid];
                if (product >= success) {
                    a = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            ans[i] = n - a;
        }
        return ans;
    }
}
