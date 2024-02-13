class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        
        int l = 0;int a = 0;
        int r = nums.length-1;
        while(l<r){
            if(nums[l]+nums[r] == k){
                l++;r--;a++;
            }
            if(nums[l]+nums[r] > k){
                r--;
            }
            if(nums[l]+nums[r] < k){
                l++;
            }
            
        }
        return a;
    }
}