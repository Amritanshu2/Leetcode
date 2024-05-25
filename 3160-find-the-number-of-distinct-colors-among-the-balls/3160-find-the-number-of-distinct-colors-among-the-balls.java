class Solution {
    public int[] queryResults(int limit, int[][] queries) {
 
       Map<Integer, Integer> ballColorMap = new HashMap<>();
        Map<Integer, Integer> colorCountMap = new HashMap<>();
        int[] result = new int[queries.length];
        int distinctColorCount = 0;

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int newColor = queries[i][1];

            if (ballColorMap.containsKey(ball)) {
                int oldColor = ballColorMap.get(ball);
                if (oldColor != newColor) {
                    colorCountMap.put(oldColor, colorCountMap.get(oldColor) - 1);
                    if (colorCountMap.get(oldColor) == 0) {
                        distinctColorCount--;
                    }
                    colorCountMap.put(newColor, colorCountMap.getOrDefault(newColor, 0) + 1);
                    if (colorCountMap.get(newColor) == 1) {
                        distinctColorCount++;
                    }

                    ballColorMap.put(ball, newColor);
                }
            } else {
                ballColorMap.put(ball, newColor);
                colorCountMap.put(newColor, colorCountMap.getOrDefault(newColor, 0) + 1);
                if (colorCountMap.get(newColor) == 1) {
                    distinctColorCount++;
                }
            }

            result[i] = distinctColorCount;
        }

        return result;
    }
}