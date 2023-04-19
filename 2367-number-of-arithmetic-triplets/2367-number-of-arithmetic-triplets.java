class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Arrays.sort(nums);int m = 0;
        for(int i = 2;i<nums.length;i++){
            for(int j = 1; j<i;j++){
                for(int k = 0;k<j;k++){
                    if((nums[i]-nums[j]) == diff && (nums[j]-nums[k]) == diff){m++;}
                    
                }
            }
        }
        return m;
    }
}