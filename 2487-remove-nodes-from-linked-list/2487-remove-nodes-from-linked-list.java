/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        Stack<Integer>st = new Stack<>();
        while(temp!= null){
            if(!st.empty() && st.peek()<temp.val){
                while(!st.empty() && st.peek()<temp.val){
                    st.pop();
                }
                st.push(temp.val);
            }
            else{
            st.push(temp.val);
            }temp = temp.next;
        }

        ListNode remp = null;
        
        while(!st.empty()){
            ListNode rew = new ListNode();
            rew.val= st.pop();
            rew.next = remp;
            remp = rew;
        }
        
        
        return remp;
        
    }
}