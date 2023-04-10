class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap <Integer,Integer> pq = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            pq.put(nums[i],1);
        }
        ArrayList <Integer> al = new ArrayList<>();
        for(int i = 1;i<=nums.length;i++){
            if(pq.containsKey(i)!= true){
                al.add(i);
            }
        }
        return al;
    }
}