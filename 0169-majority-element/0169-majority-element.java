class Solution {
    public int majorityElement(int[] nums) {
        
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
            if(hm.get(nums[i])>nums.length/2){
                return nums[i];
            }
        }
        
            return 0;
        }
    
}