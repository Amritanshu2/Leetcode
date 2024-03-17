class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        hlpr(nums,target,0,0);
        return count;
    }
    
    public void hlpr(int[]nums, int tar, int sum, int i){
        
        if(i == nums.length){
            if(sum == tar){count++;}
            return;
        }
        
        hlpr(nums,tar,sum+nums[i],i+1);
        hlpr(nums,tar,sum-nums[i],i+1);
    }
}