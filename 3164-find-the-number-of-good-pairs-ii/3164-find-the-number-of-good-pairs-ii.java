class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        int len1 = nums1.length;
        int len2 = nums2.length;

        for(int i=0;i<len2;i++)
        {
            map.put(nums2[i], map.getOrDefault(nums2[i],0)+1);
        }
        
        long ans = 0;
        for(int i=0;i<len1;i++)
        {
            if(nums1[i]%k==0)
            {
                int val = nums1[i]/k;
                for(int j=1;j<=(int)Math.sqrt(val);j++)
                {
                    if(val%j==0)
                    {
                        ans+=map.getOrDefault(val/j,0);

                        if(val!=(j*j))
                        ans+=map.getOrDefault(j,0);
                    }
                }
            }
        }
        return ans;
    }
}