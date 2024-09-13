class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            result[i] = xor(arr, queries[i][0], queries[i][1]);
        }
        
        return result;
    }
    
    public int xor(int[] arr, int i1, int j) {
        int a = arr[i1];
        for (int i = i1 + 1; i <= j; i++) {
            a ^= arr[i];
        }
        return a;
    }
}
