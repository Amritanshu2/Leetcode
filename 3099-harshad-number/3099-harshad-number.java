class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;int gf = x;
        while(gf>0){
            sum += gf%10;
            gf/=10;
        }
        return x%sum == 0 ? sum :-1;
    }
}