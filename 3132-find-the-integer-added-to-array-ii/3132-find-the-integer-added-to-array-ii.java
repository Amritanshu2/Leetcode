class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m = nums1.length;
        int n = nums2.length;
        int res = Integer.MAX_VALUE;
        for(int i = 0; i<m;i++){
            int diff = nums2[0] - nums1[i];
            int count = 1, k = i+1, l=1;
            while(k<m && l<n && (nums2[l] - nums1[k]) >= diff){
                if(nums2[l] - nums1[k] == diff){
                    count++;
                    l++;
                    k++;
                }else{
                    k++;
                }
            }
            if(count == n){
                res = Math.min(res,diff);
            }
        }
        return res;
    }
}