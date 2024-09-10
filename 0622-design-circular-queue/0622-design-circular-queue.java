class MyCircularQueue {
    
     ListNode head;
    int size =0 ;int maxs= 0;

    public MyCircularQueue(int k) {
        head = new ListNode(-1);
        maxs = k;
    }
    
    public boolean enQueue(int value) {
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
    
    public boolean deQueue() {
        if(size <= 0){return false;}
        ListNode temp = head.next;size--;
        head.next = temp.next;
        temp.next = null;
        return true;
    }
    
    public int Front() {
        if(size <= 0){return -1;}
        return (head.next).val;
    }
    
    public int Rear() {
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
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */