class Solution {
    public String decodeAtIndex(String s, int k) {
        long size = 0;
        int n = s.length();
        
        // Calculate the size of the decoded string
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                size *= (c - '0');
            } else {
                size++;
            }
        }

        // Traverse the string in reverse to find the k-th character
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            k %= size; // Adjust k to be within the current segment size

            // If k is zero and the character is not a digit, it's the k-th character
            if (k == 0 && Character.isLetter(c)) {
                return String.valueOf(c);
            }

            // If it's a digit, update the size
            if (Character.isDigit(c)) {
                size /= (c - '0');
            } else {
                size--;
            }
        }

        return null; // This line should not be reached if k is valid
    }
}
