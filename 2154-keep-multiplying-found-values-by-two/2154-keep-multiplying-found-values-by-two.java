class Solution {
    public int findFinalValue(int[] nums, int o) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            hm.put(nums[i],1);
        }
        while(hm.containsKey(o)){
            o = o*2;
        }
        return o;
    }
}