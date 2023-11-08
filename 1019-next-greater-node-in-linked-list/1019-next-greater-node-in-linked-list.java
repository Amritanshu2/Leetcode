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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer>al = new ArrayList<>();
        ListNode temp =head;
        while(temp != null){
            al.add(temp.val);
            temp = temp.next;
        }
        Stack<Integer> st = new Stack<>();
        for(int i = al.size()-1;i>=0;i--){
            if(st.size()==0){st.push(al.get(i));al.set(i, 0);}
            else{
                if(st.peek()>al.get(i)){int a =al.get(i);al.set(i,st.peek());st.push(a);}
                else {
                    while(st.size()>0){
                        if(st.peek()>al.get(i)){int a =al.get(i);al.set(i,st.peek());st.push(a);break;}
                        else{st.pop();}
                    }
                    if(st.size()==0){st.push(al.get(i));al.set(i, 0);}
                }
            }
        }
        int arr[] = new int[al.size()];
        for(int i = 0;i<arr.length;i++){
            arr[i] = al.get(i);
        }
        return arr;
    }
}