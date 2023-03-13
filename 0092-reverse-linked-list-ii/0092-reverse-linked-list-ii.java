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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;int i1 = 0;
        while(temp != null){
            i1++;
            temp = temp.next;
        } temp =  head;
        int [] arr = new int[i1];int i = 0;
        while(temp != null){
            arr[i] = temp.val;
            i++;temp = temp.next;
        } int k = right-1;
        for(int j = left-1;j< (left+right)/2; j++){
            int templ = arr[j];
            arr[j] = arr[k];
            arr[k] = templ;k--;
        } temp = head;i= 0;
        while(temp != null){
            temp.val = arr[i];
            temp = temp.next;i++;
        }
        return head;

    }
}