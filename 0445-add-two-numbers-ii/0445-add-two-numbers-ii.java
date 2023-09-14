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
    
    public void num1(ListNode L1,ArrayList<Integer>al){
        if(L1 == null){return;}
        al.add(0,L1.val);
        num1(L1.next,al);
    }
    public ArrayList<Integer> sum (ArrayList<Integer>al,ArrayList<Integer>ak){
        int i = 0;
        int rem = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<al.size() && i<ak.size()){
            ans.add((al.get(i)+ak.get(i)+rem)%10);
            rem = (al.get(i) + ak.get(i) + rem)/10;i++;
        }
        while( i<ak.size()){
            ans.add((ak.get(i)+rem)%10);
            rem = (ak.get(i)+rem)/10; i++;
        }
        while( i<al.size()){
            ans.add((al.get(i)+rem)%10);
            rem = (al.get(i) + rem)/10;i++;
        }
        while(rem!=0){
            ans.add(rem);
            rem = rem/10;
        }
        return ans;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer>al = new ArrayList<>();
        ArrayList<Integer>as = new ArrayList<>();
        num1(l1,al);
        num1(l2,as);
        
        ArrayList<Integer> ad = sum(al,as);
        System.out.println(sum(al,as));
        int i = ad.size()-1;
        ListNode  root = new ListNode();
        root.val = ad.get(i);
        ListNode temp = root;
        i--;
        while(i>=0){
            
            ListNode  remp = new ListNode();
            remp.val = ad.get(i);
            temp.next = remp;
            temp = temp.next;i--;
        }
        return root;
    }
}