class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){hm.put(nums[i],1);}
            else{hm.put(nums[i],hm.get(nums[i])+1);}
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue()<2){return -1;}
            ans = ans + (entry.getValue()+2)/3;
        }
        return ans;
    }
}