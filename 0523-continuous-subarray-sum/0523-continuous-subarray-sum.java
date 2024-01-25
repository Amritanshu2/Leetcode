class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        int total = nums[0];
        hm.put(total%k,0);
        for(int i = 1;i<nums.length;i++){
            total+=nums[i];
            if(total%k==0 || (hm.containsKey(total%k)&&  i-hm.get(total%k)!=1)){return true;}
            if(!hm.containsKey(total%k)){hm.put(total%k,i);}
        }
        return false;}
}