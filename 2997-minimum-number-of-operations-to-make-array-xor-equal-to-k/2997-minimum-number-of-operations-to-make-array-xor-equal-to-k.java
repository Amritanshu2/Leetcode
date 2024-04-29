class Solution {
    public int minOperations(int[] nums, int k) 
    {
        int xor=0;
        
        for(int i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];
        }
        
        
        return Integer.bitCount(xor^k);
    }
}