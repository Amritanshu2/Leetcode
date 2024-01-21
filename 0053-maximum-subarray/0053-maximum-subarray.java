class Solution {
    public int maxSubArray(int[] nums) {
        int max = -(int)1e8;int a = 0;
        for(int i = 0;i<nums.length;i++){
            if(a < 0){
                a = 0;
                a += nums[i];
            }
            else a+=nums[i];
            if(a>max){max = a;}
            
        }
        return  max;
    }
}