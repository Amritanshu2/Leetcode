class Solution {
    public boolean check(int[] nums) {
        int k = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                k++;
            }
            
        }
        if(nums[nums.length-1]>nums[0]){
            k++;
        }
        if(k>1){
            return false;
        }
        return true;
    }
}