class Solution {
    
    HashMap<Integer,Integer>hm = new HashMap<>();
    
    public void has(int[]nums){
        for(int i = 0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){hm.put(nums[i],hm.get(nums[i])+1);}
            else{hm.put(nums[i],1);}
        }
    }
    List<List<Integer>>al = new ArrayList<>();
    public List<List<Integer>> findMatrix(int[] nums) {
        has(nums);
        while(!hm.isEmpty()){
            List<Integer>as = new ArrayList<>();
            Iterator<Map.Entry<Integer, Integer>> iterator = hm.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> entry = iterator.next();
                as.add(entry.getKey());
                if (entry.getValue() - 1 == 0) {
                    iterator.remove();
                } else {
                    hm.put(entry.getKey(), entry.getValue() - 1);
                }
            }

            al.add(new ArrayList<>(as));
        }
        return al;
    }
}