class Solution {
    int nums[];
    public int minCostClimbingStairs(int[] cost) {
        nums = new int[cost.length];
        Arrays.fill(nums,-1);
        return Math.min(min(cost,0),min(cost,1));
        
    }
    
    public int min(int[]arr,int i){
        if(i>=arr.length){return 0;}
        if(nums[i]!=-1){return nums[i];}
        int a = min(arr,i+1)+arr[i];
        int b = min(arr,i+2)+arr[i];
        return nums[i] = Math.min(a,b);
    }
}