class Solution {
    public int maxProduct(int[] nums) {
        int max = -(int)1e8;
        for(int i = 0;i<nums.length;i++){
            int a = 1;
            for(int j = i;j<nums.length;j++){
                
                a = a*nums[j];
                max = Math.max(max,a);
                
            }
        }
        return max;
    }
}