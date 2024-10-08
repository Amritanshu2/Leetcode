class Solution {
    
    public int maxProduct(int[] nums) {
        
        int pre = 1;int suf = 1;int max = -(int)1e9;
        
        for(int i = 0;i<nums.length;i++){
            
            pre *= nums[i];
            suf *= nums[nums.length-1-i];
            
            max = Math.max(max,Math.max(pre,suf));
            if(pre == 0){pre = 1;}
            if(suf == 0){suf = 1;}
        }
        
        return max;
    }
}