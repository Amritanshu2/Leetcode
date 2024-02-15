class Solution {
    public long largestPerimeter(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }

        Arrays.sort(nums);
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];             
        }
        
        for (int i = nums.length - 1; i >= 0; i--) {
             if(sum - nums[i] <= nums[i]){
                     sum = sum - nums[i];  
            }   else{return sum;}
        }
     return -1;
    }
}