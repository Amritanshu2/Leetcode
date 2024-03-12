import java.util.HashMap;

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
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer, ListNode> hm = new HashMap<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        int sum = 0;

        while (temp != null) {
            sum += temp.val;
            if (hm.containsKey(sum)) {
                temp = hm.get(sum).next;
                int key = sum + temp.val;
                while (key != sum) {
                    hm.remove(key);
                    temp = temp.next;
                    key += temp.val;
                }
                hm.get(sum).next = temp.next;
            } else {
                hm.put(sum, temp);
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}
