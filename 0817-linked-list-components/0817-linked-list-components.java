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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer>hs = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        ListNode temp = head;boolean conn = false;int connected = 0;
        while(temp!=null){
            if(conn == false && hs.contains(temp.val)){
                conn = true;connected++;
            }
            else if(!hs.contains(temp.val)){conn = false;}
            temp = temp.next;
        }
        return connected;
    }
}