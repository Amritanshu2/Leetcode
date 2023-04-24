class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ar = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int ele:nums){
            if(hm.containsKey(ele)){
                hm.put(ele,hm.get(ele)+1);
            }
            else{
                hm.put(ele,1);
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(hm.containsKey(nums[i]) && hm.get(nums[i])>nums.length/3){
                ar.add(nums[i]);
                hm.remove(nums[i]);
            }
        }
        return ar;
    }
}