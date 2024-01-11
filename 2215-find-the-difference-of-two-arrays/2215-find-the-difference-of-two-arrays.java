class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>n1 = new HashSet<>();
        HashSet<Integer>n2 = new HashSet<>();
        for(int i = 0;i<nums1.length;i++){
            n1.add(nums1[i]);
        }
        for(int i = 0;i<nums2.length;i++){
            n2.add(nums2[i]);
        }
        List<List<Integer>>al = new ArrayList<>();
        
        List<Integer>a = new ArrayList<>();
        List<Integer>l = new ArrayList<>();
        for(int j = 0;j<nums1.length;j++){
            if(!n2.contains(nums1[j])){n2.add(nums1[j]);l.add(nums1[j]);}
        }al.add(l);
        for(int j = 0;j<nums2.length;j++){
            if(!n1.contains(nums2[j])){n1.add(nums2[j]);a.add(nums2[j]);}
        }al.add(a);
        
        return al;
        
        
        
    }
}