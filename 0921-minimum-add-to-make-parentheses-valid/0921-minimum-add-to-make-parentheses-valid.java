class Solution {
    public int minAddToMakeValid(String s) {
        return isValid(s);
    }
    
    public static int isValid(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                continue; // Ignore alphabetic characters
            } else if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.size();
    }
}