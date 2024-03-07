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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[]arr = new ListNode[k];
        int size = size(head);
        ListNode temp = head;int g = 0;int h = size%k;
        while(temp!= null){
            ListNode rew = temp;
            
            if(g<h){
                ListNode rw = temp;
                for(int i = 0;i<(size/k)+1 && temp!=null;i++){
                    rw = temp;
                    temp = temp.next;
                }
                
                rw.next = null;
                
            }
            else{
                ListNode rw = temp;
                for(int i = 0;i<(size/k) && temp!=null;i++){
                    rw = temp;
                    temp = temp.next;
                }
                
                rw.next = null;
            }
            
            arr[g] = rew;
            
            g++;
        }
        return arr;
    }
    public int size(ListNode head){
        if(head == null){return 0;}
        int a = 0;
        while(head!=null){
            a++;head = head.next;
        }
        return a;
    }
}