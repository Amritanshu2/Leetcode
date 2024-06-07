import java.util.*;

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Collections.sort(dictionary, (a, b) -> a.length() - b.length());

        Set<String> dictSet = new HashSet<>(dictionary);

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 1; j <= word.length(); j++) {
                String prefix = word.substring(0, j);
                if (dictSet.contains(prefix)) {
                    words[i] = prefix; 
                    break; 
                }
            }
        }

        return String.join(" ", words);
    }
}
