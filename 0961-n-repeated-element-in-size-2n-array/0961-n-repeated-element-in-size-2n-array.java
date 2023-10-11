class Solution {
    public int repeatedNTimes(int[] nums) {
        int a = -1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> mapElement : hm.entrySet()) {
            int key = mapElement.getKey();
            
            if(hm.get(key) >= nums.length/2){
                a = key;break;
            }
        }
        return a;
    }
}