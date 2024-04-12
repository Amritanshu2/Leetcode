class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 0,i = 0;int j = 0;
        while(j<nums.length){
            if(j == nums.length-1){max = Math.max(max,j-i+1);break;}
            if(nums[j+1]<=nums[j]){
                max = Math.max(max,j-i+1);
                i = j+1;
            }
            j++;
        }
        i = 0;j = 0;
        while(j<nums.length){
            if(j == nums.length-1){max = Math.max(max,j-i+1);break;}
            if(nums[j+1]>=nums[j]){
                max = Math.max(max,j-i+1);
                i = j+1;
            }
            j++;
        }
        return max;
        
    }
}