class Solution {
    public int minSwaps(int[] nums) {
        int no1_s = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]== 1){no1_s++;}
        }
        int num = 0;
        for(int i = 0;i<no1_s;i++){
            if(nums[i] == 1){num++;}
        }
        int i = 1;int j = no1_s;int min = num;
        while(i != 0 && no1_s != min){
            if(nums[i-1] == 1){num--;}
            if(nums[j] == 1){num++;}
            min = Math.max(num,min);
            i++;j++;
            i = i%nums.length;j = j%nums.length;
        }
        return no1_s - min;
    }
}