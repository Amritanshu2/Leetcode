class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hs = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            hs.put(nums[i],i);
        }
        int[]arr = new int[2];
        for(int i = 0;i<nums.length;i++){
            if(hs.containsKey(target-nums[i])){
                arr[0] = i+1;
                arr[1] = hs.get(target-nums[i])+1;
                break;
            }
        }
        return arr;
    }
}