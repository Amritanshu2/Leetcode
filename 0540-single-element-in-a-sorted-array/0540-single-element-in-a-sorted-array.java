class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i = 0;
        
        while(i<nums.length){
            if(i+1!=nums.length && nums[i]==nums[i+1]){ i= i+2;}
            if(i+1<nums.length && nums[i]!=nums[i+1]){
                return nums[i];
            }
            if(nums.length==1 || (i==nums.length-1 && nums[i-1]!=nums[i])){
            return nums[i];
        }
            
        }
        return -1;
    }
}