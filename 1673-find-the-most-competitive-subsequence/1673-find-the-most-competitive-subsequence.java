import java.util.Stack;

class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            // While the stack is not empty and the current element is smaller than the top of the stack
            while (!stack.isEmpty() && nums[i] < stack.peek() && stack.size() - 1 + n - i >= k) {
                stack.pop(); // Pop elements until the condition is satisfied
            }
            if (stack.size() < k) {
                stack.push(nums[i]); // Push the current element onto the stack if there's room
            }
        }
        
        // Convert the stack to an array
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}
