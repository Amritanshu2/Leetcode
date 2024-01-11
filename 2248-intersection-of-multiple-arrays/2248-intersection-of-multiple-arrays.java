class Solution {
    HashSet<Integer>hs = new HashSet<>();
    public List<Integer> intersection(int[][] nums) {
        
        for(int i = 0;i<nums[0].length;i++){
            hs.add(nums[0][i]);
        }
        for(int i = 1;i<nums.length;i++){
            HashSet<Integer>hm = new HashSet<>();
            for(int j = 0;j<nums[i].length;j++){
                if(hs.contains(nums[i][j])){hm.add(nums[i][j]);}
            }
            hs.clear(); 
            hs = new HashSet<>(hm);
        }
        List<Integer>al = new ArrayList<>(hs);
        Collections.sort(al);
        return al;
    }
}