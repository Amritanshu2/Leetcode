 class Solution {
   
  HashSet<List<Integer>> al = new HashSet<>();
   
  public void array(List<Integer>aa, int i , int[]nums){
    if(i==nums.length && aa.size()>1){ArrayList<Integer> copy = new ArrayList<> (aa);al.add(copy);return;}
    if(i==nums.length){return;}
    int m = 0;
    if(aa.size()==0 || nums[i]>=aa.get(aa.size()-1)){
    aa.add(nums[i]);m++;
    }
    array(aa,i+1,nums);
    if(m>0){
    aa.remove(aa.size()-1);}
    array(aa,i+1,nums);
     
  }
   
  public List<List<Integer>> findSubsequences(int[] nums) {
    List<Integer>aa = new ArrayList<>();
    array(aa,0,nums);
    List<List<Integer>>set = new ArrayList<>();
    
        for (List<Integer> element : al) {
            set.add(element);
        }
    return set;
  }
}