class Solution {
    public int minElement(int[] nums) {
        int min = nums[0];
        for(int ele : nums){
            int sum = 0;
            while(ele>0){
                sum += ele%10;
                ele/=10;
            }
            min = Math.min(sum,min);
        }
        return min;
    }
}