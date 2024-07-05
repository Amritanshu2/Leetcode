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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        int arr[] = new int[2];
        if(head.next == null || (head.next).next == null){Arrays.fill(arr,-1);return arr;}
        
        ListNode slow = head;
        ListNode fast = (head.next).next;
        List<Integer> al = new ArrayList<>();int i  = 0;int min = (int)1e8;
        
        while(fast != null){
            int a = slow.val;
            int b = (slow.next).val;
            int c = fast.val;
            
            if(a<b && c<b){
                al.add(i);
                if(al.size()>1){min = Math.min(min,al.get(al.size()-1) - al.get(al.size()-2));}
            }
            else if(a>b && c>b){
                al.add(i);
                if(al.size()>1){min = Math.min(min,al.get(al.size()-1) - al.get(al.size()-2));}
            }
            i++;
            
            slow = slow.next;fast = fast.next;
        }
        
        if(al.size()>1){
            arr[0] = min;arr[1] = al.get(al.size()-1)-al.get(0);
            return arr;
        }
        arr[0] = -1;arr[1] = -1;
        return arr;
    }
    
}