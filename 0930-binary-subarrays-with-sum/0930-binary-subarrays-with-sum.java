class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        if(goal == 0){return sd(nums,goal);}
        return sd(nums,goal)-sd(nums,goal-1);
    }
    public int sd(int[]nums,int goal){
        int l = 0,r = 0,total = 0,count = 0;
       while(r<nums.length){
           total += nums[r];
           while(total>goal && l<=r){
               total -= nums[l];l++;
           }
           count += r-l+1;r++;
       } 
        return count ;
    }
}