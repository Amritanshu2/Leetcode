class Solution {
    public int numberOfPairs(int[] nums, int[] nums2, int k) {
        int a = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums[i]%(nums2[j]*k) ==0){a++;}
            }
        }
        return a;
    }
}