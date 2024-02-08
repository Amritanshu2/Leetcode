class Solution {
    int arr[];
    public int rob(int[] nums) {
        if(nums.length==1){return nums[0];}
        arr = new int[nums.length];
        Arrays.fill(arr,-1);
        int a = rb(nums,0,nums.length-1);
        Arrays.fill(arr,-1);
        int b = rb(nums,1,nums.length);
        return Math.max(a,b);
    }
    
    public int rb(int[]nums,int i,int end){
        if(i>=end){return 0;}
       
        
        if(arr[i]!=-1){return arr[i];}
        
        int a = rb(nums,i+1,end);
        int b = rb(nums,i+2,end)+nums[i];
        return arr[i] =  Math.max(a,b);
    }
} 