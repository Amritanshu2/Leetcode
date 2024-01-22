class Solution {
    public int[] findErrorNums(int[] nums) {
        int a = nums.length;
        int arr[] = new int[2];
        // Arrays.sort(nums);
        HashSet<Integer>hs = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(hs.contains(nums[i])){arr[0]= nums[i];}
            hs.add(nums[i]);
        }
        for(int i = 1;i<=nums.length;i++){
            if(!hs.contains(i)){arr[1] = i;break;}
        }
        
        return arr;
    }
}