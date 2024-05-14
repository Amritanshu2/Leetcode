class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2) return true; 
        double slope = getSlope(coordinates[0], coordinates[1]);
        
        for (int i = 2; i < coordinates.length; i++) {
            double currentSlope = getSlope(coordinates[i-1], coordinates[i]);
            if (currentSlope != slope) {
                return false; 
            }
        }
        
        return true; 
    }
    
    
    private double getSlope(int[] point1, int[] point2) {
        if (point1[0] == point2[0]) {
            return Double.POSITIVE_INFINITY; 
        } else {
            return (double) (point2[1] - point1[1]) / (point2[0] - point1[0]);
        }
    }
}
