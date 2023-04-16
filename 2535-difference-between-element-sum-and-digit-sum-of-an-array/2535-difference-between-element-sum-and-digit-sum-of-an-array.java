class Solution {
    public int differenceOfSum(int[] nums) {
        int sumd =0;
        for(int i = 0;i<nums.length;i++){
            sumd += nums[i] ;
        }
        int sumn = 0;
        for(int i = 0;i<nums.length;i++){
            while(nums[i]>0){
                sumn += nums[i]%10;
                nums[i]/=10;
                
            }
        }
        return sumd-sumn;
    }
}