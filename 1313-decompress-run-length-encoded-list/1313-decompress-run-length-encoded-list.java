class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0;i<nums.length;i=i+2){
            for(int r = 0;r<nums[i];r++){
                al.add(nums[i+1]);
            }
        }
        int[] intArray = al.stream().mapToInt(Integer::intValue).toArray();
        return intArray;
    }
}