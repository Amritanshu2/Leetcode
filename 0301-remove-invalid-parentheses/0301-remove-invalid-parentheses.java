import java.util.*;

public class Solution {

    public List<String> removeInvalidParentheses(String s) {
        HashSet<String> validStrings = new HashSet<>();
        int[] maxLength = {0}; // Array to hold the maximum length encountered
        removeInvalid(s, 0, 0, new StringBuilder(), validStrings, maxLength);
        List<String> result = new ArrayList<>();
        for (String str : validStrings) {
            if (str.length() == maxLength[0]) { // Add only maximum length strings to the result
                result.add(str);
            }
        }
        return result;
    }

    private void removeInvalid(String s, int index, int openCount, StringBuilder current, HashSet<String> validStrings, int[] maxLength) {
        if (index == s.length()) {
            if (openCount == 0 && isValid(current.toString())) {
                int len = current.length();
                maxLength[0] = Math.max(maxLength[0], len); // Update maximum length
                validStrings.add(current.toString());
            }
            return;
        }

        char ch = s.charAt(index);
        int len = current.length();

        if (ch != '(' && ch != ')') {
            removeInvalid(s, index + 1, openCount, current.append(ch), validStrings, maxLength);
            current.setLength(len); // Backtrack
        } else {
            // Exclude current character
            removeInvalid(s, index + 1, openCount, current, validStrings, maxLength);

            // Include current character
            current.append(ch);
            if (ch == '(') {
                removeInvalid(s, index + 1, openCount + 1, current, validStrings, maxLength);
            } else if (openCount > 0) {
                removeInvalid(s, index + 1, openCount - 1, current, validStrings, maxLength);
            }
            current.setLength(len); // Backtrack
        }
    }

    public boolean isValid(String s) {
        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
                if (balance < 0) {
                    return false;
                }
            }
        }
        return balance == 0;
    }

   
}
