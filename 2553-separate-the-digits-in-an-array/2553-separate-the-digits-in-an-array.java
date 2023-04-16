class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList <Integer> arr = new ArrayList<>();
        for(int i = nums.length-1;i>=0;i--){
            while(nums[i]>0){
                arr.add(nums[i]%10);
                nums[i] = nums[i]/10;
            }
        }
        int ar[] = new int[arr.size()];int m =0;
        for(int i = arr.size()-1;i>=0;i--){
            ar[m] = arr.get(i);m++;
        }
        return ar;
    }
}