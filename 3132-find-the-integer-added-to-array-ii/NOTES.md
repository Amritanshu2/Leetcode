class Solution {
public int minimumAddedInteger(int[] nums1, int[] nums2) {
Arrays.sort(nums1);
Arrays.sort(nums2);int j = 0;int diff = 0;
chk(0,0,0,nums1,nums2);
return a;
}
int a = 0;
public void chk(int i, int j, int diff, int[]nums1, int[]nums2){
if(j == nums2.length){a = diff;}
if(j == nums2.length || i == nums1.length){return;}
if(j == 0){
chk(i+1,j+1,nums2[j]-nums1[i],nums1,nums2);
chk(i+1,j,diff,nums1,nums2);
return;
}
else if(nums2[j] - nums1[i] != diff){
chk(i+1,j,diff,nums1,nums2);return;
}
else{
chk(i+1,j+1,diff,nums1,nums2);
chk(i+1,j,diff,nums1,nums2);
}
}
}