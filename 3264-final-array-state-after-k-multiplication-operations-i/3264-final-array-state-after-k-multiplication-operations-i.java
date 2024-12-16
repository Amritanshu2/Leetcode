import java.util.PriorityQueue;

class Solution {

    public class Num implements Comparable<Num> {
        private long val;
        private int pos;

        public Num(long val, int pos) {
            this.val = val;
            this.pos = pos;
        }

        @Override
        public int compareTo(Num other) {
            int valComparison = Long.compare(this.val, other.val);
            if (valComparison != 0) {
                return valComparison;
            }
            return Integer.compare(this.pos, other.pos);
        }
    }

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Num> pq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            pq.add(new Num(nums[i], i));
        }

        while (k > 0) {
            Num minNum = pq.poll();
            long updatedVal = minNum.val * (long) multiplier; // Safe multiplication with explicit casting
            pq.add(new Num(updatedVal, minNum.pos)); // Reinsert a new object with updated value
            k--;
        }

        int MOD = 1_000_000_007;
        while (!pq.isEmpty()) {
            Num temp = pq.poll();
            nums[temp.pos] = (int) (temp.val % MOD); // Apply modulo operation
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {161209470, 56851412, 39846};
        int k = 2;
        int multiplier = 2;

        int[] result = solution.getFinalState(nums, k, multiplier);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
