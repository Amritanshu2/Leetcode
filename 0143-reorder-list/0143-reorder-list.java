class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){return;}
        ListNode temp = head;
        int i = 0;
        Stack<ListNode> st = new Stack<>();
        while(temp != null){
            i++;
            st.push(temp);
            temp = temp.next;
        }
        
        temp = head.next;
        ListNode remp = new ListNode(head.val);int j = 1;
        ListNode rt = remp;
        while(j<i){
            if(j%2==0){
                ListNode rew = new ListNode(temp.val);
                rt.next = rew;
                temp = temp.next;
                rt = rt.next;
                j++;
            }
            else{
                ListNode rew = new ListNode((st.pop()).val);
                rt.next = rew;
                rt = rt.next;
                j++;
                
            }
        }
        // while(remp!= null){
        //     System.out.print( "->" +remp.val);
        //     remp = remp.next;
        // }
        ListNode emp = head;
        emp = emp.next;
        remp = remp.next;
        while(remp != null){
            emp.val = remp.val;
            emp = emp.next;
            remp = remp.next;
        }

       
       
        
        
    }
}