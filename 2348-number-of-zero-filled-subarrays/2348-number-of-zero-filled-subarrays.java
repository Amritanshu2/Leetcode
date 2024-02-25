class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int i = 0,j = 0;long total = 0;
        while(j<nums.length){
            if(nums[j] == 0 && nums[i]==0){
                
                total += (j-i+1);j++;
            }
            else if(nums[j] == 0 && nums[i]!=0){
                i = j;
                total += 1;j++;
            }
            else{
                i = j;
                j++;
            }
        }
        return total;
    }
}