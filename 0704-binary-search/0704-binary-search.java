class Solution {
    public int search(int[] nums, int target) {
        int k = nums.length-1;
        return search_hlpr(nums,target,0,k);
    }
    public static int search_hlpr(int []nums,int target,int start,int end){
        int n = (start+end)/2;
        if(nums[n]==target){
            return n;
        }
        if (nums[n]>target && start!= end && n-1>=0){
            end = n-1;
            return search_hlpr(nums,target,start,end);
        }
        if(nums[n]<target  && start!=end && n+1<nums.length){
            start = n+1;
            return search_hlpr(nums,target,start,end);
        }
        else{
            return -1;
        }
    }
}