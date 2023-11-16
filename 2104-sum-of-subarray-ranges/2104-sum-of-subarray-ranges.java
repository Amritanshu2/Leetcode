class Solution {
    public long subArrayRanges(int[] arr) {
        long s = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minVal = arr[i];
            int maxVal = arr[i];

            for (int j = i; j < n; j++) {
                minVal = Math.min(minVal, arr[j]);
                maxVal = Math.max(maxVal, arr[j]);
                s += maxVal - minVal;
            }
        }
        return s;
    }
}
