class Solution {
    public int missingNumber(int[] nums) {
         Arrays.sort(nums);
       for(int i = 1;i<=nums.length;i++){
           int k=0;
           for(int j = 0;j<nums.length;j++){
               if(nums[j]==i){
                   k = 1;
                   break;
               }
           }
           if(k==0){
               return i;
               
           }
       }
        return 0;
       
    }
}


