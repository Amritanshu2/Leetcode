class Solution {
    public boolean isPerfectSquare(int num) {
        int a = (int)Math.sqrt(num); 
        if(a*a==num){
            return true;
        }
        return false;
    }
}