class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = 0;int []arr = new int[2];
        arr[0]=-1;arr[1]=-1;
        while(i<nums.length){
            if(nums[i]== target ){
                if((i>0 && nums[i-1]!=target) || i==0){
                    arr[0] = i;
                }
                if((i+1 != nums.length && nums[i+1]!=target) || i == nums.length-1){
                    arr[1] = i;
                    break;
                }
            }
            
            i++;
        }
        return arr;
    }
}