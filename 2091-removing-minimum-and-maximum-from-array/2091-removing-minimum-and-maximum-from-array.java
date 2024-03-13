class Solution {
    public int minimumDeletions(int[] nums) {
        int small = (int)1e8;int idxs = -1;
        int large = -(int)1e8; int idxl = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>large){large = nums[i];idxl = i;}
            if(nums[i]<small){small = nums[i];idxs = i;}
        }
        int min = (int)1e8;
        min = Math.min(Math.max(idxl,idxs)+1,min);
        min = Math.min(nums.length-Math.min(idxl,idxs),min);
        min = Math.min(idxl+1+(nums.length-idxs),min);
        min = Math.min(idxs+1+(nums.length-idxl),min);
        return min;
        
    }
}