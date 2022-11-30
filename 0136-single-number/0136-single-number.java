class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(i==nums.length-1 || nums[i+1]!=nums[i]){
                if(i==0 || nums[i-1]!=nums[i]){
                    return nums[i];
                }
            }
            
        }
        return 0;
    }
}