class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[] min = new int[n];
        for(int i=0;i<n;i++){
            String t = timePoints.get(i);
            int h = Integer.parseInt(t.substring(0,2));
            int m = Integer.parseInt(t.substring(3));
            min[i] = h*60+m;
        }
        Arrays.sort(min);
        int ans = Integer.MAX_VALUE;
        for(int i =0;i<n-1;i++){
            int d = min[i+1]-min[i];
            ans = Math.min(ans,d);
        }
        return Math.min(ans,24*60-min[n-1]+min[0]);
    }
}