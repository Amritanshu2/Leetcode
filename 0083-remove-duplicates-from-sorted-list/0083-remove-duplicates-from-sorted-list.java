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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        while(temp!=null && temp.next != null ){
            if(temp.val == temp.next.val){
                
                while(temp!=null && temp.next != null && temp.val == temp.next.val){ 
                
                ListNode hump = temp.next;
                
                temp.next = hump.next;
                hump.next = null;
                
            }}
            temp = temp.next;
        }
        return head;
    }
}