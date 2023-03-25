class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length <=1){
            return 0;
        }
        int diff = -1;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i] > diff){
                diff = nums[i+1]-nums[i];
            }
        }
        
        return diff;
    }
}