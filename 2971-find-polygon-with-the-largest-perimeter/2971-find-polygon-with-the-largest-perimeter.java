class Solution {
    public long largestPerimeter(int[] array) {
        long sum = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for(int val : array){
            sum+=val;
        }
        if(per(array,0,sum)==0){return -1;}
        
        return per(array,0,sum);
        
    }
    
    public long per(int[]nums,int i,long sum){
        if(i==nums.length){return 0;}
        long total = 0;
        if(sum - nums[i]>nums[i]){
            total = nums[i]+per(nums,i+1,sum);
        }
        else{
            total = per(nums,i+1,sum-nums[i]);
        }
        return total;
    }
}