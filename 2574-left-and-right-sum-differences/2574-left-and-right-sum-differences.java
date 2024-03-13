class Solution {
    public int[] leftRightDifference(int[] nums) {
       
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
        }
        int[]arr = new int[nums.length];
        if(nums.length==1){return arr;}
        arr[0] = sum-nums[0];
        int lft = 0,rgt= sum-nums[0];
        for(int i = 1;i<nums.length;i++){
            
            lft += nums[i-1];
            rgt -= nums[i];
            arr[i] = Math.abs(rgt-lft);
        }
        return arr;
    }
}