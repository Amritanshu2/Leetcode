class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxL = 0;
        int numo = 0;  

        while (right < nums.length) {
            if (nums[right] == 0) {
                numo++;
            }
            
            while (numo > k) {
                if (nums[left] == 0) {
                    numo--;
                }
                left++;
            }

            maxL = Math.max(maxL, right - left + 1);
            right++;
        }
        
        return maxL;
    }
}
