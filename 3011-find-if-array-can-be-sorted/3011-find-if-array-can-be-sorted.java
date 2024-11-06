class Solution {
    public boolean canSortArray(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            int a1 = 0;
            for(int j = 0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    if(Integer.bitCount(nums[j]) != Integer.bitCount(nums[j+1])){
                        return false;
                    }
                    int a = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = a;
                    a1++;
                }
            }
            if(a1 == 0)break;
        }
        return true;
    }
}