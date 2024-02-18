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
    
    public int getSize(ListNode head) {
        int size = 0;
        ListNode current = head;
        
        // Traverse the list and count the nodes
        while (current != null) {
            size++;
            current = current.next;
        }
        
        return size;
    }
    
    
    public ListNode partition(ListNode head, int x) {
        
        int a = getSize(head);
        for(int i = 0;i<=a;i++){
            ListNode temp = head;
            ListNode remp = head;
            while(temp!= null){
                if(remp.val>=x && temp.val <x){
                    int f = remp.val;
                    remp.val = temp.val;
                    temp.val = f;
                }
                remp = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}