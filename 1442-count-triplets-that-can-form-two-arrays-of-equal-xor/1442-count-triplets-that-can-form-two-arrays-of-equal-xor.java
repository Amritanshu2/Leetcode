class Solution {
    public int countTriplets(int[] arr) {
        int[] xor = new int[arr.length + 1];
        
        for (int i = 0; i < arr.length; i++) {
            xor[i + 1] = xor[i] ^ arr[i];
        }
        
        int ans = 0;
        
        for (int i = 0; i < xor.length; i++) {
            for (int j = i + 1; j < xor.length; j++) {
                if (xor[i] == xor[j]) {
                    ans += (j - i - 1);
                }
            }
        }
        
        return ans;
    }
}
