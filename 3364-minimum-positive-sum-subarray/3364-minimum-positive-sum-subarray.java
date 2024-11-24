class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int sum = (int)1e8;
        for(int i = 0;i<nums.size();i++){
            int temp = 0;
            for(int j = 0;i+j<nums.size() && j<r;j++){
                temp+= nums.get(i+j);
                if(j>=l-1 && temp> 0)sum = Math.min(sum,temp);
            }
        }
        return sum != (int)1e8 ? sum :-1;
    }
}