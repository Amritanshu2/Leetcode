class Solution {
    public char findKthBit(int n, int k) {
        String s = "0";
        if(k == 1){return '0';}
        if(k == 2){return '1';}
        
        for(int i = 2;i<=n && s.length()<k;i++){
            s = s + '1' + reverseAndInverse(s);
        }
        return s.charAt(k-1);
    }
    
    public static String reverseAndInverse(String input) {
        StringBuilder result = new StringBuilder();

        
        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);

            
            if (ch == '0') {
                result.append('1');
            } else if (ch == '1') {
                result.append('0');
            } else {
                result.append(ch); 
            }
        }

        return result.toString();
    }
}