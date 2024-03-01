class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        if(nums.length == 0 || p == 0){
            return 0;
        }

        Set<String> subarraySet = new HashSet<>();
        int divisibles = 0;
        int start = 0, end = 0;
        StringBuilder sb = new StringBuilder();

        while(start < nums.length){
            
           
            if(nums[end] % p == 0){
                divisibles++; 
            }
           
            if(divisibles <= k){
                sb.append("," + nums[end]);
                subarraySet.add(sb.toString());
                end++;

                if(end == nums.length){
                    divisibles = 0;
                    sb.setLength(0);
                    start++;
                    end = start;
                    
                }
            }else{
                divisibles = 0;
                sb.setLength(0);
                start++;
                end = start;
            }                       
        }

        return subarraySet.size();
    }
}