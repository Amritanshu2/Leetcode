class Solution {
    public int countSubarrays(int[] nums) {
        int[]arr = {nums[0],nums[1],nums[2]};
        int cnt = 0;
        if((nums[0]+nums[2])*2 == nums[1]){cnt++;}
        int a = nums[1];
        int i = 3;
        while(i<nums.length){
            if((nums[i-2]+nums[i])*2 == nums[i-1]){cnt++;}
            i++;
        }
        return cnt;
    }
}