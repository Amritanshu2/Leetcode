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
    
    public int size(ListNode head){
        int s = 0;
        while(head!=null){
            s++;head = head.next;
        }
        return s;
    }
    
    
    public ListNode chng(ListNode head){
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
    
    
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int s = size(head);int d  = 1;
        ListNode temp = head;int i = 0;
        ListNode remp = head;
        
        while(temp != null){
            i++;
            if(i == d || (temp.next==null && i%2==0)){
                if(i%2 == 0 ){
                    ListNode rew = temp.next;
                    temp.next = null;
                    remp.next = chng(remp.next);
                    while(remp.next!= null){remp = remp.next;}
                    remp.next = rew;d++;i =0;temp = remp;
                }
                else{
                    d++;i =0;remp = temp;
                    
                }
            }
            temp = temp.next;
        }
        return head;
    }
}