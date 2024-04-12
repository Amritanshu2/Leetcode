class Solution {
    public long minimalKSum(int[] nums, int k) {
    
        Arrays.sort(nums);
        long sum=0;
        long prev=0;
        for(int i=0;i<nums.length;i++){
            if(prev==nums[i])
               continue;

            long n=nums[i]-prev-1;
            if(n>k)
            n=k;
            sum+=(((2*(prev+1))+(n-1))*n)/2;
            k-=n;
            prev=nums[i];

            if(k==0)
               return sum;
        }

        if(k!=0)
        {
           long l=prev+k;
           sum+=((prev+1+l)*k)/2;
        }


        return sum;
    }
}