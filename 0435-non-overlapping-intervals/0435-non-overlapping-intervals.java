class Solution {
    public int eraseOverlapIntervals(int[][] points) {
        int arrow = 0;
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int lft = -(int)1e8;
        int rgt = -(int)1e8;
        for(int i = 0;i<points.length;i++){
            if(i!=0 && (lft < points[i][1] && rgt > points[i][0] )){
                arrow++;continue;
            }
            else{
                lft = points[i][0]; rgt = points[i][1];
            }
        }
        return arrow;

    }
}