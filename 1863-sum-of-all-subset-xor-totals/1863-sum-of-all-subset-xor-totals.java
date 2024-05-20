class Solution {
    public int subsetXORSum(int[] nums) {
      
      return sub(nums,0,new ArrayList<>());
        
    }
    
    public int sub(int[]nums,int i, List<Integer>al){
        if(i == nums.length){return xorOfArrayList(new ArrayList<>(al));}
        al.add(nums[i]);
        int a = sub(nums,i+1,al);
        al.remove(al.size()-1);
        int b = sub(nums,i+1,al);
        return a+b;
    }
    
    public int xorOfArrayList(ArrayList<Integer> nums) {
        int xorResult = 0;
        for (int num : nums) {
            xorResult ^= num;
        }
        return xorResult;
    }
}