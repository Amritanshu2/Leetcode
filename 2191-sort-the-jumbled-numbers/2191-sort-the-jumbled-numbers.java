class Solution {
    
    HashMap<Integer,Integer>hm = new HashMap<>();
    
    public int[] sortJumbled(int[] mapping, int[] nums) {
        for (int i = 0; i < mapping.length; i++) {
            hm.put(i, mapping[i]);
        }
        
        int[] mappedNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            mappedNums[i] = change(nums[i]);
        }
        
        Integer[] indices = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            indices[i] = i;
        }
        
        Arrays.sort(indices, (a, b) -> Integer.compare(mappedNums[a], mappedNums[b]));
        
        int[] sortedNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sortedNums[i] = nums[indices[i]];
        }
        
        return sortedNums;
    }

    public int change(int num) {
        if(num == 0){return hm.get(0);}
        int result = 0;
        int multiplier = 1;
        while (num > 0) {
            int digit = num % 10;
            result += hm.get(digit) * multiplier;
            multiplier *= 10;
            num /= 10;
        }
        return result;
    }
}