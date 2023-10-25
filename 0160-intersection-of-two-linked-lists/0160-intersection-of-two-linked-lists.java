/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode>hs = new HashSet<>();
        ListNode temp = headA;
        while(temp!= null){
            hs.add(temp);
            temp = temp.next;
        }
        ListNode remp = headB;
        while(remp!=null){
            if(hs.contains(remp)){
                return remp;
            }
            remp = remp.next;
        }
        return null;
    }
}