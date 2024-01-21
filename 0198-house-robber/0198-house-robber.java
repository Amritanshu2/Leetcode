class Solution {
    
    int arr[];
    
    public int chk(int[]nums,int i){
        if(i>=nums.length){return 0;}
        if(arr[i] != -1){return arr[i];}
        int a = chk(nums,i+2)+nums[i];
        int b = chk(nums,i+1);
        return arr[i] = Math.max(a,b);
    }
    
    public int rob(int[] nums) {
        arr = new int[nums.length];
        Arrays.fill(arr,-1);
        return chk(nums,0);
    }
}