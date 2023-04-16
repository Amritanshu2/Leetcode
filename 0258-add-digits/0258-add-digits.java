class Solution {
    public int addDigits(int num) {
        while(num/10>0){
            int j = 0;
            while(num >0){
                j = j+num%10;
                num = num/10;
            }
            
            num = j;
        }
        return num;
    }
}