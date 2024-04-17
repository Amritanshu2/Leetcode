import java.util.HashSet;

class Solution {
    public int maxVowels(String s, int k) {
        if (k <= 0 || k > s.length()) {
            return 0;
        }

        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int maxVowelsCount = 0;
        int i = 0, j = 0, currentVowelCount = 0;
        
        while (j < s.length()) {
            if (j - i < k) {
                if (vowels.contains(s.charAt(j))) {
                    currentVowelCount++;
                }
                j++;
            }
            // Slide the window
            else {
                maxVowelsCount = Math.max(maxVowelsCount, currentVowelCount);
                if (vowels.contains(s.charAt(i))) {
                    currentVowelCount--;
                }
                i++;
            }
        }
        
        maxVowelsCount = Math.max(maxVowelsCount, currentVowelCount);

        return maxVowelsCount;
    }
}
