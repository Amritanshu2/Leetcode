import java.util.*;

class Solution {
    HashMap<Integer, Boolean> memo;
    
    public boolean wordBreak(String s, List<String> wordDict) {
        memo = new HashMap<>();
        HashSet<String> wordSet = new HashSet<>(wordDict);
        return chk(s, 0, wordSet);
    }
    
    public boolean chk(String s, int start, HashSet<String> wordSet) {
        if (start == s.length()) {
            return true;
        }
        if (memo.containsKey(start)) {
            return memo.get(start);
        }
        
        boolean canBreak = false;
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordSet.contains(s.substring(start, end)) && chk(s, end, wordSet)) {
                canBreak = true;
                break;
            }
        }
        
        memo.put(start, canBreak);
        return canBreak;
    }
}
