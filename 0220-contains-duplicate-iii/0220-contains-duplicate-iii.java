class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int o) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(i+k>=nums.length){
               for(int j = i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])<=o){return true;}
                } 
            }
            else{
                for(int j = i+1;j<=i+k && i+k<=nums.length-1;j++){
                if(Math.abs(nums[i]-nums[j])<=o){return true;}
            }}
        }
        return false;
    }
}