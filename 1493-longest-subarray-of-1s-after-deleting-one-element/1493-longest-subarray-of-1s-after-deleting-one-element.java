class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;int right = 0;int max = 0;int del = 0;
        while(right<nums.length){
            if(nums[right] == 0){del++;}
            while(del>1){
                if(nums[left]==0){del--;}
                left++;
            }
            max = Math.max(max,right-left);
            right++;
        }
        return max;
    }
}