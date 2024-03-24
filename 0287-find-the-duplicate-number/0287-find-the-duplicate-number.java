class Solution {
    HashSet<Integer>hs = new HashSet<>();
    public int findDuplicate(int[] nums) {
        
        for(int i = 0;i<nums.length;i++){
            if(hs.contains(nums[i])){return nums[i];}
            hs.add(nums[i]);
        }
        return -1;
    }
}