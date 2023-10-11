class Solution {
    public int longestValidParentheses(String s) {
        int maxLen = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);  // Initialize the stack with an initial index

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);  // Push the index of '(' to the stack
            } else {
                stack.pop();  // Pop the last index from the stack for '('

                if (stack.isEmpty()) {
                    stack.push(i);  // Push the current index if the stack is empty
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        
        return maxLen;
    }
}