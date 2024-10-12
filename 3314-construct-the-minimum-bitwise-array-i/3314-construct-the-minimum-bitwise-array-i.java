class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[]arr = new int[nums.size()];
        for(int i = 0;i<arr.length;i++){
            arr[i] = check(nums.get(i));
        }
        return arr;
    }
    
    public int check(int nums){
        for(int i = 0;i<nums;i++){
            if((i | i+1) == nums){return i;}
        }
        return -1;
    }
}