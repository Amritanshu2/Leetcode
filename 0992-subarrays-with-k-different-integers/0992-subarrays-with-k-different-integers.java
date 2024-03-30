class Solution {
    int a = 0;ArrayList<Integer>al = new ArrayList<>();
    
    
    public void sub1(int[] nums,int k,HashMap<Integer,Integer>hm){
        for(int i = k;i<=nums.length;i++){
            for(int j = 0;j<=nums.length-i;j++){
                for(int l = j;l<j+i;l++){
                    if(hm.size()>k){break;}
                     hm.put(nums[l], hm.getOrDefault(nums[l], 0) + 1);
                }
                if(hm.size()==k){a++;}
                hm.clear();
            }
        }
    }
    
    public int atmostk(int[]nums,int k){
        int s = 0;int ans =0;
        Map<Integer,Integer>hm = new HashMap<>();
        for(int e = 0;e<nums.length;e++){
            hm.put(nums[e], hm.getOrDefault(nums[e],0)+1);
            while(hm.size()>k){
                if(hm.get(nums[s])>1){
                    hm.put(nums[s],hm.get(nums[s])-1);
                }else{
                    hm.remove(nums[s]);
                }
                s++;
            }
            ans += e-s+1;
        }
        return ans;
    }
    
    
    
    public int subarraysWithKDistinct(int[] nums, int k) {
//         HashMap<Integer,Integer>hm = new HashMap<>();
        
//         sub1(nums,k,hm);
        
        return atmostk(nums,k)-atmostk(nums,k-1);
    }
}