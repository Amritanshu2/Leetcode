class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0,max =0;
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i =0;i<k;i++){
            sum += nums[i];
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        if(hm.size() == k)max = sum;
        int i = 0;int j = k;
        while(j<nums.length){
            sum += nums[j];
            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
            sum -= nums[i];
            hm.put(nums[i],hm.getOrDefault(nums[i],0)-1);
            if(hm.get(nums[i]) == 0){hm.remove(nums[i]);}
            i++;j++;
            if(hm.size() == k){
            max = Math.max(sum,max);}
        }
        return max;
    }
}