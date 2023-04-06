class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr,1);
        for(int i = 1;i<nums.length;i++){
            arr[0] = arr[0]*nums[i];
        }
        for(int i = 1;i<nums.length;i++){
            if(nums[i]==0){for(int j = 0;j<nums.length;j++){
                if(j == i){continue;}
            arr[i] = arr[i]*nums[j];
        }}
            else
            arr[i] = (arr[i-1]*nums[i-1])/nums[i];
        }
        return arr;
    }
}