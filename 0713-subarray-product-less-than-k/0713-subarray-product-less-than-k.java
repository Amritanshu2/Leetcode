class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){return 0;}
        int l = 0,r = 0,total = 0,p = 1;
        for(int i = 0;i<nums.length;i++){
            p *= nums[i];
            while(p >= k){
                p /= nums[l]; l++;
            }
            total += i-l+1;
        }
        return total;
    }
}