class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3){return 0;}
        int i = 0;int j = 0;int size = 0;int total = 0;
        while(j<nums.length ){
            if(i!=j && nums[i+1]-nums[i] != nums[j]-nums[j-1]){i = j-1;j++;size = j-i;}
            else{j++;size = j-i;}
            if(size>=3){total += j-i-2;}
        }
        return total;
    }
}