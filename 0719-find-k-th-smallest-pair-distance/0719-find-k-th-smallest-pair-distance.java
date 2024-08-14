class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);   
        int[][]arr = new int[1+nums[nums.length-1]-nums[0]][1];
        for(int i = 0;i<nums.length;i++){
            for(int  j = i+1;j<nums.length;j++){
                arr[Math.abs(nums[i]-nums[j])][0]++;
            }
        }
        
        int i= 0;
        while(k>0){
            k -= arr[i][0];i++;
        }
        
        return i-1;
    }
}