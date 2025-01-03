

class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        int n = words.length;
        if (n == 1) {
            return words[0].charAt(0) == words[0].charAt(words[0].length() - 1);
        }
        for (int i = 1; i < n; i++) {
            if (words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
                return false;
            }
        }
        return words[0].charAt(0) == words[n - 1].charAt(words[n - 1].length() - 1);
    }
}
