class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length-1];
        if(b%a==0){return a;}
        for(int i = a/2;i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 0;
    }
}