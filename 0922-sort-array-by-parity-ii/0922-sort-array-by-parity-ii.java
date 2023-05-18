class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        Arrays.sort(nums);
        int [] sol = new int [nums.length];int k = 0,j = nums.length-1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                sol[k]= nums[i];k+=2;
            }
            else{
                sol[j]= nums[i];j-=2;
            }
        }
        return sol;
        
    }
}