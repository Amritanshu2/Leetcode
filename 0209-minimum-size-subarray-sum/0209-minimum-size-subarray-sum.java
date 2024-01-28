class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int right = 0,left = 0,total = 0,min = nums.length+1;
        for(right = 0;right<nums.length;right++){
            total += nums[right];
            while(total>=target){
                min = Math.min(min,right-left+1);
                total -= nums[left];left++;
            }
            
        }
        return min == nums.length+1? 0 :min;
    }
}