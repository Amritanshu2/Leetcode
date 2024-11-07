class Solution {
    public int largestCombination(int[] candidates) {
        int max = 0;
        
        for (int bit = 0; bit < 32; bit++) {
            int count = 0;
            for (int num : candidates) {
                if ((num & (1 << bit)) != 0) {
                    count++;
                }
            }
            max = Math.max(max, count); 
        }
        
        return max;
    }
}
