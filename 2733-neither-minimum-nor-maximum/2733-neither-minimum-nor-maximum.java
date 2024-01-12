class Solution {
    HashSet<Integer>hs = new HashSet<>();
    public int findNonMinOrMax(int[] nums) {
        for(int i = 0;i<nums.length;i++)hs.add(nums[i]);
        ArrayList<Integer>al = new ArrayList<>(hs);
        Collections.sort(al);
        if(al.size()<3){return -1;}
        return al.get(1);
    
    }
}