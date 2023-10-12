class Solution {
    public int smallestRangeI(int[] nums, int k) {
        if(nums.length<2){return 0;}int a = 0;
        Arrays.sort(nums);
        a =( nums[0]+nums[nums.length-1])/2;
        // System.out.println(a);
        
        // for(int i = 0;i<nums.length;i++){
        //     if(nums[i]>a){
        //         if(nums[i]-a <=k){nums[i] = nums[i]-(nums[i]-a);}
        //         else{nums[i] = nums[i]-k;}
        //     }
        //     else if(nums[i]<a){
        //         if(nums[i]-a <= k){nums[i] = nums[i]+(nums[i]-a);}
        //         else{nums[i] = nums[i]+k;}
        //     }
        // }
        if(k> a-nums[0]){nums[0] = nums[0]+(a-nums[0]);}
        else{nums[0] = nums[0]+k;}
        if(k> nums[nums.length-1]-a){nums[nums.length-1] = nums[nums.length-1]-(nums[nums.length-1]-a);}
        else{nums[nums.length-1] = nums[nums.length-1]-k;}
        
        return nums[nums.length-1]-nums[0];
    }
}