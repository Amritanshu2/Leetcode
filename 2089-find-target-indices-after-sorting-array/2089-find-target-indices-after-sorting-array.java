class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer>al = new ArrayList<>();
        int i = 0;
        while(i<nums.length && nums[i]<=target){
            if(nums[i] == target){al.add(i);}
            i++;
        }
        return al;
    }
}