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
    public int pairSum(ListNode head) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> qe = new LinkedList<Integer>();
        ListNode temp = head;
        while(temp!=null){
            st.push(temp.val);
            qe.add(temp.val);
            temp = temp.next;
        }
        int max = 0;int h = 0;
        while(h<st.size()){
            int a = st.pop()+qe.remove();
            if(max < a){max =a;}
            h++;
        }
        return max;
    }
}