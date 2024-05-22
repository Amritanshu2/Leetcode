import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    
    List<List<String>> ans = new ArrayList<>();
    HashMap<String, Boolean> hm = new HashMap<>();
    
    public List<List<String>> partition(String s) {
        part(s, new ArrayList<>(), 0, "");
        return ans;
    }
    
    public void part(String s, List<String> al, int i, String as) {
        if (i == s.length()) {
            if (!as.isEmpty()) {
                al.add(as);
            }
            if (check(al)) {
                ans.add(new ArrayList<>(al));
            }
            if (!as.isEmpty()) {
                al.remove(al.size() - 1);
            }
            return;
        }
        
        // Recursive call without adding a new segment
        part(s, al, i + 1, as + s.charAt(i));
        
        // Recursive call with adding a new segment if as is not empty
        if (!as.isEmpty()) {
            al.add(as);
            part(s, al, i + 1, "" + s.charAt(i));
            al.remove(al.size() - 1);
        }
    }
    
    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public boolean check(List<String> strings) {
        for (String str : strings) {
            if (hm.containsKey(str)) {
                if (!hm.get(str)) {
                    return false;
                }
            } else {
                boolean isPalin = isPalindrome(str);
                hm.put(str, isPalin);
                if (!isPalin) {
                    return false;
                }
            }
        }
        return true;
    }
}
