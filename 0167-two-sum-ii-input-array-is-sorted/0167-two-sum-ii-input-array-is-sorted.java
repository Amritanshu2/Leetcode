class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while(true){
            if(nums[i] + nums[j] > target){
                j--;
            }
            else if(nums[i] + nums[j] < target){
                i++;
            }
            else{
                int []arr = new int[2];
                arr[0] = i+1;
                arr[1] = j+1;
                return arr;
            }
        }
        // return new int[2];
    }
}