class Solution {
    public long continuousSubarrays(int[] nums) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        
        int i = 0; 
        long ans = 0; 
        
        for (int j = 0; j < nums.length; j++) {
            min.add(nums[j]);
            max.add(nums[j]);
            
            while (max.peek() - min.peek() > 2) {
                min.remove(nums[i]);
                max.remove(nums[i]);
                i++; 
            }
            
            
            ans += (j - i + 1);
        }
        
        return ans;
    }
}
