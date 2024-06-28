class Solution {
    public double minimumAverage(int[] nums) {
        double a = 0;Arrays.sort(nums);List<Double>al = new ArrayList<>();
        for(int i = 0;i< nums.length/2; i++){
             al.add((double)(nums[i]+nums[nums.length-1-i])/2);
        }
        Collections.sort(al);
        return al.get(0);
    }
}