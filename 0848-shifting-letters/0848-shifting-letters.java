class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] characters = new char[26];
        for (int i = 0; i < 26; i++) {
            characters[i] = (char) ('a' + i);
        }

        int totalShift = 0;
        StringBuilder result = new StringBuilder();

        // Accumulate shifts in reverse order
        for (int i = shifts.length - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]) % 26;
            int index = (s.charAt(i) - 'a' + totalShift) % 26;
            result.insert(0, characters[index]); // Insert at the beginning to maintain order
        }

        return result.toString();
    }
}
