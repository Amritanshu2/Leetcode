class MyCircularDeque {
    
    ListNode head;
    int size =0 ;int maxs= 0;

    public MyCircularDeque(int k) {
        head = new ListNode(-1);
        maxs = k;
    }
    
    public boolean insertFront(int value) {
        if(size >= maxs){return false;}
        ListNode temp = new ListNode(value);
        temp.next = head.next;
        head.next = temp;
        size++;
        return true;
        
    }
    
    public boolean insertLast(int value) {
        if(size >= maxs){return false;}
        ListNode temp = head;
        ListNode temp1 = new ListNode(value);
        size++;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = temp1;
        return true;
    }
    
    public boolean deleteFront() {
        if(size <= 0){return false;}
        ListNode temp = head.next;size--;
        head.next = temp.next;
        temp.next = null;
        return true;
    }
    
    public boolean deleteLast() {
        if(size <= 0){return false;}
        ListNode temp = head;ListNode prev = head;size--;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return true;
    }
    
    public int getFront() {
        if(size <= 0){return -1;}
        return (head.next).val;
    }
    
    public int getRear() {
        if(size <= 0){return -1;}
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public boolean isEmpty() {
        if(size == 0){return true;}
        return false;
    }
    
    public boolean isFull() {
        if(size == maxs){return true;}
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */