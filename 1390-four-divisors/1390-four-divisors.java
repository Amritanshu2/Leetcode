class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += check(nums[i],new HashSet<>());
        }
        return sum;
    }
    
    public int check(int num, HashSet<Integer>hs){
        for(int i = 1;i*i<=num;i++){
            if(num%i == 0){hs.add(i);hs.add(num/i);}
        }
        if(hs.size() == 4){
            int a = 0;
            Iterator<Integer> iterator = hs.iterator();
        
        
            while (iterator.hasNext()) {
                a+= (iterator.next());
            }
            return a;
        }
        return 0;
    }
}