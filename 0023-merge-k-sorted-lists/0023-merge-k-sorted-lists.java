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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0;i<lists.length;i++){
            ListNode temp = lists[i];
            while(temp!=null){
                al.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(al);
        ListNode vgo = new ListNode();
        if(al.size()==0){return null;}
        ListNode rem = vgo;
        rem.val = al.get(0);int i = 1;
        while(i<al.size()){
            ListNode temp = new ListNode();
            temp.val = al.get(i);i++;
            rem.next = temp;
            rem = rem.next;
        }
        return vgo ;
        
    }
}