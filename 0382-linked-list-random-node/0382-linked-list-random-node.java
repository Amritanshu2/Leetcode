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
    List<Integer>al;
    public Solution(ListNode head) {
        al = new ArrayList<>();
        while(head!= null){
            al.add(head.val);
            head = head.next;
        }
    }
    
    public int getRandom() {
        Random random = new Random();
        int a = random.nextInt(al.size());
        return al.get(a);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */