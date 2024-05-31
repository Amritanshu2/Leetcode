class Solution {
    public int[] singleNumber(int[] nums) {
        int a [] = new int[2];int d = 0;
        Arrays.sort(nums);
        for(int i = 1;i<nums.length-1;i++){
            if ((i < nums.length - 1 && nums[i] != nums[i + 1] )&&( i > 0 && nums[i] != nums[i - 1])) {
            a[d] = nums[i];
            d++;
        }
            
            if(d == 2){return a;}
        }
        if(nums[0]!=nums[1]){a[d] = nums[0];d++;}if(nums[nums.length-1]!= nums[nums.length-2]){a[d] = nums[nums.length-1];}
        return a;
    }
}