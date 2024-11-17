class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        List<Integer>al = new ArrayList<>();
        al.add(0);
        for(int i = 0;i<nums.size()-1;i++){
            if(nums.get(i) >= nums.get(i+1)){
                al.add(i+1);
            }
        }
        al.add(nums.size());
        int max = 0;List<Integer>size = new ArrayList<>();
        for(int i = 0;i<al.size()-1;i++){
            size.add(al.get(i+1)-al.get(i));
        }
        for(int i = 0;i<size.size()-1;i++){
            max = Math.max(max,Math.min(size.get(i), size.get(i+1)));
        }
        Collections.sort(size);
        int a = size.get(size.size()-1);
        return max>a/2?max:a/2;
    }
}