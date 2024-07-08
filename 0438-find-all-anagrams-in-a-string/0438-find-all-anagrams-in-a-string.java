import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p1) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p1 == null || p1.length() == 0 || p1.length() > s.length())
            return result;
        
        char[] pChars = p1.toCharArray();
        Arrays.sort(pChars);
        String pSorted = new String(pChars);
        
        int windowSize = p1.length();
        for (int i = 0; i <= s.length() - windowSize; i++) {
            String substr = s.substring(i, i + windowSize);
            char[] substrChars = substr.toCharArray();
            Arrays.sort(substrChars);
            String sortedSubstr = new String(substrChars);
            
            if (pSorted.equals(sortedSubstr)) {
                result.add(i);
            }
        }
        
        return result;
    }
}
