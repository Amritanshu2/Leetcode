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
    public int Size(ListNode head){
        if(head ==null){return 0;}
        int a = 1+Size(head.next);
        return a ;
    }
    public ListNode rev(ListNode head, int k){
        ListNode temp = head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode ans = head;int a = 0;
        while(a<k){
            ans = curr;
            curr = temp.next;
            temp.next = prev;
            prev = temp;
            temp = curr;
            a++;
            
            
        }
        head = ans;
        return head;
    }
    
    
    
    public ListNode reverseKGroup(ListNode head, int k) {
        int size = Size(head);
        System.out.println(size);
        ListNode temp = head;
        ListNode tre = head;
        int a = size/k;
        ListNode root = new ListNode();
        ListNode rew = root;
        for(int i = 0;i<a;i++){
            for(int j = 0;j<k;j++){
                tre = tre.next;
            }
            temp = rev(temp,k);
            
            while(temp!= null){
                ListNode qwe = new ListNode();
                qwe.val = temp.val;temp = temp.next;
                rew.next = qwe;
                rew = rew.next;
            }
            temp = tre;
        }
        while(tre!=null){
            ListNode qwe = new ListNode();
                qwe.val = tre.val;tre = tre.next;
                rew.next = qwe;
                rew = rew.next;
        }
        
        return root.next;
        
    }
    
    
}