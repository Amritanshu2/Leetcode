class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>hm = new HashMap<>();int sum = 0;int max = 0;
        hm.put(0,-1);
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){sum--;}
            else if(nums[i] == 1){sum++;}
            
            if(hm.containsKey(sum)){
                max = Math.max(max,i - hm.get(sum));
            }
            else if(!hm.containsKey(sum)){hm.put(sum,i);}
        }
        return max;
    }
}