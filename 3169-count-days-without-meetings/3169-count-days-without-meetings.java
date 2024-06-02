class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int availableCount = 0;
        int currentEnd = 0;

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];
            if (start > currentEnd) {
                availableCount += start - currentEnd - 1;
            }
            currentEnd = Math.max(currentEnd, end);
        }

        availableCount += days - currentEnd;

        return availableCount;
    }
}
