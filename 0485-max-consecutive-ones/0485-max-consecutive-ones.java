class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k=0,m=0;int [] arr = new int[nums.length];
        Arrays.fill(arr,-1);
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=1 || i == nums.length-1){
                if(i==nums.length-1 && nums[i]==1){
                   arr[m]=k+1;
                m++;
                k=0; 
                }
                else{arr[m]=k;
                m++;
                k=0;}
            }
            else{
                k++;
            }
        }
        int m2 = arr[0];
        for(int i = 1;i<arr.length;i++){
            m2 = Math.max(m2,arr[i]);
        }
        return m2;
    }
}