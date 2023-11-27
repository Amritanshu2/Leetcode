class Solution {
    
    List<List<Integer>> all = new ArrayList<>();
    
    public void check(int[]nums,List<Integer>al ,int size){
        
        if(size==nums.length){
            all.add(new ArrayList(al));
            return;
        }
        
        for(int i = 0;i<nums.length;i++){
            if(!al.contains(nums[i])){
                al.add(nums[i]);
                check(nums,al,size+1);
                al.remove(al.size()-1);
               
            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        int i = 0;
        List<Integer>al = new ArrayList<>();
        check(nums,al,i);
        return all;
    }
}