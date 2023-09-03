class Solution {
    
    public List<List<Integer>> al = new ArrayList<>();
    
    public void pwh(int []nums,int i,ArrayList<Integer> subset){
        if(i>=nums.length){
            al.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        pwh(nums,i+1,subset);
        subset.remove(subset.size()-1);
        pwh(nums,i+1,subset);
    }                    
                                  
    
    
                   
    
    public List<List<Integer>> subsets(int[] nums) {
       
        ArrayList<Integer> subset=new ArrayList<>();
        pwh(nums,0,subset);
        
        return al;
    }
}