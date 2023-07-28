class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i = 0;int j  = 0;
        for(int k = 0;k<nums.length;k++){
            if(nums[k]==1){
                i = nums[k];
                j = k;
                break;
            }
        }
        if(i == 0){return 1;}
        while(j < nums.length-1){
            if(nums[j] != nums[j+1]-1 && nums[j] != nums[j+1]){
                return  nums[j]+1;
            }j++;
        }
    
        return nums[nums.length-1]+1;
        
    }
}