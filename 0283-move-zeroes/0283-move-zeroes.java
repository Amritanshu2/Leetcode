class Solution {
    public void moveZeroes(int[] nums) {
        int n =0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                n++;
            }
            else{
                nums[i-n] = nums[i];
            }
        }
        for(int i = nums.length-n;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}