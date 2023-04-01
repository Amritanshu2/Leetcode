class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList <Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int ele : nums){
            if(hm.containsKey(ele)){
                hm.put(ele,hm.get(ele)+1);
            }
            else{
                hm.put(ele,1);
            }
        }
        for (Map.Entry<Integer,Integer> mapElement : hm.entrySet()) {
            if(mapElement.getValue()>1){
                arr.add(mapElement.getKey());
            }
        }
        return arr;
            
    }
}