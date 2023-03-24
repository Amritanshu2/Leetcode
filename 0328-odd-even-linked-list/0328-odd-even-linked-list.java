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
    public ListNode oddEvenList(ListNode head) {
        int size = 0;
        ListNode emp = head;
        while(emp!=null){
            emp = emp.next;
            size++;
        }
        if(size==0 || size ==1 || size ==2){
            return head;
        }
        int arr[] = new int[size/2];
        int i = 0;
        ListNode remp = head.next;
        ListNode temp = head;
        while(temp != null && remp != null && remp.next != null && temp.next != null ){
            temp.next = remp.next;
            arr[i] = remp.val;i++;
            remp = (temp.next).next;
            if(remp!= null){arr[i] = remp.val;}
            temp = temp.next;
        }if(temp.next!=null){
            temp.next = null;
        }
        temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        int j = 0;
        if(size%2!=0){
            while(j<i){
            ListNode rew = new ListNode(); 
            rew.val = arr[j];j++;
            temp.next = rew;
            temp = temp.next;
        }
        }
        else{
            while(j<=i){
            ListNode rew = new ListNode(); 
            rew.val = arr[j];j++;
            temp.next = rew;
            temp = temp.next;
        }
        }
        
        return head;
    }
}