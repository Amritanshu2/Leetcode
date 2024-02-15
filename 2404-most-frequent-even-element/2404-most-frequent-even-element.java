class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        Arrays.sort(nums);int a = -1,mf = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                int f = hm.getOrDefault(nums[i],0)+1;
                hm.put(nums[i],f);
                if(mf < f){a = nums[i];mf = f;}
            }
        }
        
        return a;
    }
}