class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                if((Math.abs(hm.get(nums[i])-start)) > (i- start)){hm.put(nums[i],i);}
            }
            else hm.put(nums[i],i);
        }
        return Math.abs(hm.get(target)-start);
    }
}