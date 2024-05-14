class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        
        if (target == 0) return true;
        
        
        if (target > x + y) return false;
        
        
        int gcd = findGCD(x, y);
        
        
        return target % gcd == 0;
    }
    
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
