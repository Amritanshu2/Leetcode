class Solution {
public long countSubarrays(int[] nums, int minK, int maxK) {
int i = 0;int j = 0;int minb = -1;int maxb = -1;int total = 0;
while(j<=nums.length){
if( j == nums.length || nums[j] > maxK || nums[j] < minK){
if(minb != -1 && maxb != -1){
total += (Math.min(maxb,minb)+1-i)*(j-Math.max(maxb,minb));
System.out.println("i: " + i + ", j: " + j + ", minb: " + minb + ", maxb: " + maxb + ", total: " + total);
j = Math.min(maxb,minb)+1;
}
else if(j != nums.length && (nums[j] > maxK || nums[j] < minK)){j = j+1;}
i = j;
minb = -1;
maxb = -1;
}
if(j == nums.length){break;}
if(nums[i]>maxK || nums[i]<minK){i++;}
if(minb == -1 && nums[j] == minK){minb = j;}
if(maxb == -1 && nums[j] == maxK){maxb = j;}
j++;
}
return total;
}
}