import java.util.TreeMap;

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < nums.length; right++) {
            countMap.put(nums[right], countMap.getOrDefault(nums[right], 0) + 1);
            
            
            while (countMap.lastKey() - countMap.firstKey() > limit) {
                countMap.put(nums[left], countMap.get(nums[left]) - 1);
                if (countMap.get(nums[left]) == 0) {
                    countMap.remove(nums[left]);
                }
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
