class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer>al = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            int sum = 0;
            for(int j = i;j<nums.length;j++){
                al.add(sum+=nums[j]);
            }
        }
        Collections.sort(al);int ans = 0;
        for(int i = left-1;i<right;i++){
            ans += al.get(i);
            ans%=1000000007;
        }
        return ans;
    }
}