import java.util.HashMap;

class Solution {
    public int numberOfSubstrings(String s, int k) {
        int count = 0;
        int left = 0;
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            charCount.put(s.charAt(right), charCount.getOrDefault(s.charAt(right), 0) + 1);

            
            while (isValid(charCount, k)) {
                
                count += s.length() - right;

                
                charCount.put(s.charAt(left), charCount.get(s.charAt(left)) - 1);
                if (charCount.get(s.charAt(left)) == 0) {
                    charCount.remove(s.charAt(left));
                }
                left++;
            }
        }

        return count;
    }

    private boolean isValid(HashMap<Character, Integer> charCount, int k) {
        for (int count : charCount.values()) {
            if (count >= k) {
                return true; 
            }
        }
        return false;
    }
}
