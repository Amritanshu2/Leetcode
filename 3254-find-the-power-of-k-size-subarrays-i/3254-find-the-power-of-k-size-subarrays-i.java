class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int arr[] = new int[nums.length-k+1];
        for(int i = 0;i<=nums.length-k;i++){
            arr[i] = check(i,nums,k);
        }
        return arr;
    }
    
    public int check(int i1, int[]nums, int k){
        if(nums.length <+ i1+k){return -1;}
        int a = nums[i1];
        for(int i = i1+1;i<i1+k;i++){
            if(nums[i]!=a+1){
                return -1;
            }
            a = nums[i];
        }
        return a;
    }
}