class Solution {
    public boolean isArraySpecial(int[] nums) {
        int prev = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2 == 0 ){
                
                if(prev == 1)return false;
                prev = 1;
            }
            if(nums[i]%2 != 0){
                if(prev == 2){return false;}
                prev = 2;
            }
        }
        return true;
        
    }
}