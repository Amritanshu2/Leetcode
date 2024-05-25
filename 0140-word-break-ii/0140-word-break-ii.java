public class Solution {
    List<String> sentences = new ArrayList<>();

    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> words = new HashSet<>(wordDict); 
        sentences = new ArrayList<>(); 
        wordBreakHelper(words, s, 0, ""); 
        return sentences; 
    }

    private void wordBreakHelper(Set<String> words, String s, int i, String sentence) {
        if (i == s.length()) {
            sentences.add(sentence); 
            return;
        }
        for (int j = i; j < s.length(); j++) { 
            String word = s.substring(i, j + 1); 
            if (words.contains(word)) {
                if (sentence.isEmpty()) { 
                    wordBreakHelper(words, s, j + 1, sentence + word); 
                } else {
                    wordBreakHelper(words, s, j + 1, sentence + " " + word); 
                }
            }
        }
    }
}