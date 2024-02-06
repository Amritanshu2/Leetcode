class Solution {
    
    int arr[];
    
    public int jum(int[] nums,int j ){
        if(j == nums.length-1){
            return 0;
        }
        if(arr[j] != -1){return arr[j];}
        int a = 10000;
        for(int i = 1;i <= nums[j]; i++){
            if(j+i<nums.length){
                
                a = Math.min(a,(jum(nums,j+i)+1));
            }
        }
        return arr[j] = a;
    }
    public int jump(int[] nums) {
        arr = new int[nums.length];
        Arrays.fill(arr,-1);
        return jum(nums,0);
    }
}