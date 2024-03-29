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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode curr = head;
        ListNode ans = head;
        ListNode prev = null;
        while(temp!=null){
            curr = temp.next;
            temp.next = prev;
            prev = temp;
            ans = temp;
            temp = curr;
        }
        head = ans;
        return head;
    }
}