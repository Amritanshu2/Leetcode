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
    public ListNode mergeInBetween(ListNode head, int a, int b, ListNode list2) {
        ListNode temp = head;
        ListNode remp = head;
        int i = 0;
        while(i < a-1){
            temp = temp.next;i++;
        }
        System.out.println(temp.val);
        remp = temp;
        remp = remp.next;i = a;
        while(i<b){
            remp = remp.next;i++;
        }
        temp.next = list2;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = remp.next;
        return head;
    }
}