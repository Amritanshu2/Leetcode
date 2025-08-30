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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = l1;ListNode remp = l2;int x = 0;ListNode kj = l1;ListNode jk = l2;
        int s = 0;int sl = 0;
        while(temp!= null){
            temp = temp.next;
            s++;
        }
        while(remp!= null){
            remp = remp.next;
            sl++;
        }temp = l1;remp = l2;int rem = 0;
        if(sl<s){
            while(temp != null && remp != null){
                x = temp.val;
                temp.val = (temp.val + remp.val + rem)%10;
                rem = (x + remp.val + rem)/10;kj = temp;
                temp = temp.next;remp = remp.next;
            }
            while(temp != null){
                x = temp.val;
                temp.val = (temp.val + rem)%10;
                rem = (x + rem)/10;kj = temp;
                temp = temp.next;
            }
            if(rem!=0){
                ListNode fr = new ListNode();
                fr.val = rem;
                kj.next = fr;
            }
            return l1;
        }
        
            while(temp != null && remp != null){
                x = remp.val;
                remp.val = (temp.val + remp.val + rem)%10;
                rem = (temp.val + x + rem)/10;jk = remp;
                temp = temp.next;remp = remp.next;
            }
            while(remp != null){
                x = remp.val;
                remp.val = (remp.val + rem)%10;
                rem = (x + rem)/10;jk = remp;
                remp = remp.next;
            }
            if(rem!=0){
                ListNode fr = new ListNode();
                fr.val = rem;
                jk.next = fr;
            }
        return l2;
    }
}