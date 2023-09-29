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
        ListNode prev = null;
        ListNode curr = head;
        ListNode ans = head;
        while(temp !=null){
            ans = curr;
            curr = temp.next;
            temp.next = prev;
            prev = temp;
            temp = curr;
            
            
            
        }
        head = ans;
        return head;
    }
}