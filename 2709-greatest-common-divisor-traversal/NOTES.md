class Solution {
public boolean canTraverseAllPairs(int[] nums) {
if(nums.length==1){return true;}
HashSet<Integer>hs = new HashSet<>();
int i = 0,j = 1;
while(i<j && j<nums.length && hs.size()<nums.length){
if(hs.size() == 0 || (hs.contains(i) && !hs.contains(j)) || (!hs.contains(i) && hs.contains(j))){
if(findGCD(nums[i],nums[j])!=1){
hs.add(i);hs.add(j);
}
}
if(j == nums.length-1 ){i++;j = i+1;}
else{j++;}
}
i = 0;j = 1;
while(i<j && j<nums.length && hs.size()<nums.length){
if(hs.contains(i)){i++;j=i+1;continue;}
if(hs.size() == 0 || (hs.contains(i) && !hs.contains(j)) || (!hs.contains(i) && hs.contains(j))){
if(findGCD(nums[i],nums[j])!=1){
hs.add(i);hs.add(j);
}
}
if(j == nums.length-1 ){i++;j = i+1;}
else{j++;}
}
System.out.println(hs);
if(hs.size()==nums.length){return true;}
else{return false;}
}
public static int findGCD(int a, int b) {
if (b == 0) {
return a;
}
return findGCD(b, a % b);
}
}