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
        if(head == null){return null;}
        return remove(head);
    }
    
    public ListNode remove(ListNode head){
        ListNode temp = head;
        ListNode remp = head;
        ListNode remove = null;
        
        while(temp != null){
            if(remove != null && temp.val == remove.val){
                if(temp == head){
                    if(temp.next == null){return null;}
                    remove = temp;
                    head = (temp.next);
                    remove.next = null;
                    temp = head;
                    remp = head;
                }
                else{
                    if(temp.next == null){remp.next = null;break;}
                    remove = temp;
                    remp.next = (temp.next);
                    temp = remp.next;
                    remove.next = null;
                }
            }
            else if(temp.next!= null && temp.val == (temp.next).val){
                if(temp == head){
                    if((temp.next).next == null){return null;}
                    remove = temp.next;
                    head = (temp.next).next;
                     (temp.next).next = null;
                    temp = head;
                    remp = head;
                }
                else{
                    if((temp.next).next == null){remp.next = null;break;}
                    remp.next = (temp.next).next;
                    remove = temp.next;
                    (temp.next).next = null;
                    
                    temp = remp;
                }
                
            }
            
            else{
                remp = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}