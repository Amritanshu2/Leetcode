class Solution {
    
    boolean a  = false;
    
    public boolean canJump(int[] nums) {
        arr = new int[nums.length];
        Arrays.fill(arr,-1);
        jump(nums,0);
        
        return a;
    }
    int arr[];
    public boolean jump(int[]nums,int j ){
        if(a == true){return true;}
        if(arr[j] != -1){return true;}
        if(j == nums.length-1){a = true;return true;}
        for(int i = 1;i<=nums[j];i++){
            if(a == true)return true;
            jump(nums,j+i);
        }
        arr[j] = 2;
        return true;
    }
}