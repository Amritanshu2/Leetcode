class Solution {
    
    ArrayList<List<Integer>>al = new ArrayList<>();
    HashSet<List<Integer>>ha = new HashSet<>();

    
    public void ext(int[]nums,ArrayList<Integer>aa,int i ,HashSet<Integer>hs){
        if(i == nums.length && !ha.contains(aa)){al.add(new ArrayList<>(aa));ha.add(new ArrayList<>(aa));return;}
        if(i == nums.length){return;}
        for(int j = 0;j<nums.length;j++){
            if(hs.contains(j)){continue;}
            hs.add(j);aa.add(nums[j]);
            ext(nums,aa,i+1,hs);
            hs.remove(j);
            aa.remove(aa.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<Integer>aa = new ArrayList<>();
        
        ext(nums,aa,0,new HashSet<>());
        return al;
    }
}