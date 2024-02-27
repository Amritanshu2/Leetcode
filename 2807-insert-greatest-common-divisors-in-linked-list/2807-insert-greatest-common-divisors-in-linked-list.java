class Solution {
    static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b); 
    }
    
    public ListNode insertGreatestCommonDivisors(ListNode head) {
         ListNode temp = head;
        while (head != null && head.next != null) {
            int gcdValue = gcd(head.val, head.next.val); 
            ListNode remp = new ListNode(gcdValue); 
            remp.next = head.next;
            head.next = remp;
            
            head = remp.next; 
        }
       return temp; }
}