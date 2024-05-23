class Solution {
    
    int a = 0;
    
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        subset(nums,k,0,new HashSet<>());
        return a;
    }
    
    public void subset(int[] nums, int k, int i, HashSet<Integer>hs){
        if(i == nums.length && hs.size()!=0){a++;return;}
        if(i == nums.length)return;
        subset(nums,k,i+1,hs);
        if(!hs.contains(nums[i]-k)){
            hs.add(nums[i]);
            subset(nums,k,i+1,hs);
            hs.remove(nums[i]);
        }
    }
}