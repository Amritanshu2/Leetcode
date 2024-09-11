class Solution {
    public int minBitFlips(int start, int goal) {
        
        int diff = start ^ goal;
        
        
        int bitFlips = 0;
        while (diff > 0) {
            bitFlips += (diff & 1);
            diff >>= 1;
        }
        
        return bitFlips;
    }
}
