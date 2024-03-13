class Solution {
    public int findMiddleIndex(int[] nums) {
        if(nums.length==1){return 0;}
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
        }
        int lft = 0,rgt= sum-nums[0];
        for(int i = 1;i<nums.length;i++){
            if(lft == rgt){return i-1;}
            lft += nums[i-1];
            rgt -= nums[i];
            if(lft == rgt){return i;}
        }
        return -1;
    }
}