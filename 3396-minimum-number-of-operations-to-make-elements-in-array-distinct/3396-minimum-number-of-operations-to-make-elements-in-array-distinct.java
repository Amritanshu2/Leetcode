class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer>hs = new HashSet<>();
        for(float i = nums.length-1;i>= 0;i--){
            if(hs.contains(nums[(int)i])){
                return (int)Math.ceil((float)(i+1)/3);
            }
            hs.add(nums[(int)i]);
        }
        return 0;
    }
}