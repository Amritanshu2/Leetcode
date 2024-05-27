class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int a = nums.length;
        for(int i = 0;i<nums.length;i++){
            if(a-i<=nums[i]){
                if(i>0 && nums[i-1]>=a-i)continue;
                return a-i;
            }
        }
        return -1;
    }
}