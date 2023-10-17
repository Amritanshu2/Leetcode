class Solution {
    public int[] secondGreaterElement(int[] nums) {
        //two stack liye ,ek me traverse karte un elements ko store kiye jo bara  hai ,baad me -1 
        ///dusre me un sabko jo kisi ek se chote hai ,check karenge agar 2 gua toh ans wale stack me add ,varna ye bi -1.
        //Elements in stack 1 s1: elements that we have iterated over previously.
/*Elements in stack 2 s2: elements that we have iterated over previosuly and there is one element greater than them.

If curr element is greater than the top of the second stack, we found a solution for the element on the top of the stack.

If curr element is greater than the top of the first stack, we remove that element and push it into the second stack.*/
     Stack<Integer> s1 = new Stack<>(), s2 = new Stack<>();
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i += 1) {
            while (!s2.isEmpty() && nums[i] > nums[s2.peek()]) {
                int idx = s2.pop();
                ans[idx] = nums[i];
            }
            
            Stack<Integer> s = new Stack<>();
            while (!s1.isEmpty() && nums[i] > nums[s1.peek()]) {
                s.push(s1.pop());
            }
            
            while (!s.isEmpty()) {
                s2.push(s.pop());
            }
            
            s1.push(i);
        }
        
        while (!s1.isEmpty()) {
            ans[s1.pop()] = -1;
        }
        
        while (!s2.isEmpty()) {
            ans[s2.pop()] = -1;
        }
        
        return ans;
    }
}