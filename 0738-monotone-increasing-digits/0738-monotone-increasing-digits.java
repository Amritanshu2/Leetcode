class Solution {
    public int monotoneIncreasingDigits(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        int marker = digits.length;
        
        
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] < digits[i - 1]) {
                marker = i - 1;
                digits[i - 1]--;
            }
        }
        
        
        for (int i = marker + 1; i < digits.length; i++) {
            digits[i] = '9';
        }
        
        return Integer.parseInt(new String(digits));
    }
}
