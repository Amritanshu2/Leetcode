class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue <>(Collections.reverseOrder());
        for(int ele : nums){
            pq.add(ele);
        }
        for(int i = 1;i<k;i++){
            pq.remove();
        }
        return pq.peek();
    }
}