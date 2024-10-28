class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
         Set<Long> mySet = new HashSet<>();
         for(int i:nums){
            mySet.add((long)i);
         }
         int res = -1;
         for(int i:nums){
            long temp = (long)i;
            int max =1;
            while(mySet.contains(temp*temp)){
                max++;
                temp = temp*temp;
                res = Math.max(res,max);


            }

         }
         return res;
    }
}