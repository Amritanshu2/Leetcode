class Solution {
    
    public static boolean isPalindrome(String cleanedStr) {

        return cleanedStr.equals(new StringBuilder(cleanedStr).reverse().toString());
    }
    
    public int removePalindromeSub(String s) {
        if(s.length() == 0){return 0;}
        if(isPalindrome(s)){return 1;}
        return 2;
    }
}