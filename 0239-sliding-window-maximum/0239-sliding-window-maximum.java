import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) return new int[0];
        
        int[] ans = new int[n - k + 1];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]); // Max heap
        
        for (int i = 0; i < k; i++) {
            pq.offer(new int[]{nums[i], i});
        }
        ans[0] = pq.peek()[0];
        
        // Process remaining elements
        for (int i = k; i < n; i++) {
            pq.offer(new int[]{nums[i], i});
            
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }
            ans[i - k + 1] = pq.peek()[0];
        }
        
        return ans;
    }
}
