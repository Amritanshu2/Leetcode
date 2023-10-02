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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode prev = temp;
        while(temp != null){
            if(temp.val == val && temp == prev){
                temp=temp.next;
                prev = temp;
                head = temp;
            }
            else if(temp.val!=val){
                prev = temp;
                temp = temp.next;
            }
            

            else if(  temp.val == val && temp.next==null){
                prev.next = null;
                temp = null;
            }
            
            else if(temp.val == val){
                prev.next = null;
                prev.next = temp.next;
                
                temp = prev.next;
            }


            
            
             
        }
        return head;
    }
}