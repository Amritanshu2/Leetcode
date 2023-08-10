class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> al = new ArrayList<>();
        HashMap<Integer , Integer> hs = new HashMap<>();
        for(int i = 0; i< nums1.length; i++){
            hs.put(nums1[i],0);
        }
        
        
        for(int i = 0; i< nums2.length; i++){
            if(hs.containsKey(nums2[i]) && hs.get(nums2[i])==0){
                al.add(nums2[i]);
                hs.put(nums2[i],10);
            }
            else if(hs.containsKey(nums2[i]) != true){hs.put(nums2[i],1);}
        }
        
        
        for(int i = 0; i< nums3.length; i++){
            if(hs.containsKey(nums3[i]) && hs.get(nums3[i])<=1){al.add(nums3[i]);hs.put(nums3[i],10);}
        }
        return al;
            
    }
}