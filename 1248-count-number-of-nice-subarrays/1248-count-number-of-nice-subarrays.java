class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left = 0;int right = 0;int total = 0;int num = 0;
        while(right<nums.length){
            if(nums[right]%2!=0 && num == k){
                while(num==k){
                    if(nums[left]%2 != 0){num--;}
                    
                    left++;
                }
            }
            
            
            
            if(nums[right]%2!=0){
                num++;
            }
            total += right-left+1;
            right++;
            
            
        }
        left = 0;right = 0;num = 0;int tot = 0;
        while(right<nums.length){
            if(nums[right]%2!=0 && num == k-1){
                while(num==k-1){
                    if(nums[left]%2 != 0){num--;}
                    
                    left++;
                }
            }
            
            
            
            if(nums[right]%2!=0){
                num++;
            }
            tot += right-left+1;
            right++;
            
            
        }
        return total-tot;
    }
}