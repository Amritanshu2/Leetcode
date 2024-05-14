class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;int j = s.length()-1;int a = 0;
        while(i<=j){
            if(s.charAt(i) == s.charAt(j)){i++;j--;continue;}
            if(a == 0 && s.charAt(i)!=s.charAt(j)){
                boolean c = false;boolean b = false;
                if(s.charAt(i+1)==s.charAt(j)){
                    c = isPalindrome(s.substring(i+1,j+1));
                    
                }
                if(s.charAt(i) == s.charAt(j-1)){
                    b = isPalindrome(s.substring(i,j));
                    
                }
                if(b || c){return true;}
            } 
            return false;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        // Check if the string is empty or has only one character
        if (s.isEmpty() || s.length() == 1) {
            return true;
        }
        
        // Use two pointers to check if the string is a palindrome
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // If characters at the two pointers don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        
        return true; // All characters matched, it's a palindrome
    }
}