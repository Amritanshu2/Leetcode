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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        while(temp.next!=null){
            if(temp.val == 0){
                ListNode remp = new ListNode(0);
                temp.next = hlpr(temp.next,remp);
            }
            temp = temp.next;
        }
        temp = head;ListNode remp = temp;
        while(temp != null){
            if(temp == head && temp.val == 0){head = head.next;temp = head;}
            if(temp.next == null && temp.val == 0){remp.next = null;break;}
            if(temp.val == 0){remp.next = temp.next;temp.next = null;temp = remp;}
            remp = temp;
            temp = temp.next;
            
        }
       
        return head;
    }
    
    public ListNode hlpr(ListNode head,ListNode temp){
        while(head.val != 0){
            temp.val = temp.val+head.val;
            head = head.next;
        }
        temp.next = head;
        return temp;
    }
}