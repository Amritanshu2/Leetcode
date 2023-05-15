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










// ..............////////////////////////////////////////////////.......................
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
//             ListNode temp = l1;ListNode Temp = l2;int i = 0;int j = 0;
//             while(temp != null){
//                 i = temp.val + i*10;
//                 temp = temp.next;
//             }
//             int reverse = 0;
//             while(i>0){
//                 reverse = i%10 + reverse*10;
//                 i /= 10;
//             }
        
//             while(Temp != null){
//                 j = Temp.val + j*10;
//                 Temp = Temp.next;
//             }
//             int Reverse = 0;
//             while(j>0){
//                 Reverse = j%10 + Reverse*10;
//                 j /= 10;
//             }
//             int ans = Reverse + reverse;
//             System.out.print(ans);
        
//             temp =  l1;
            
//             while(temp.next!=null){
//                 temp.val = ans%10;
//                 temp = temp.next;ans = ans/10;
//             }
//             temp.val = ans%10;ans/=10;
            
        
//             while(ans > 0){
//                 ListNode dfs = new ListNode();
//                 dfs.val = ans%10;
//                 temp.next = dfs;
//                 temp = temp.next;ans /= 10;
//             }
            
            
//             return l1;
//     }
// }