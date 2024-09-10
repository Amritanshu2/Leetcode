class MyLinkedList {

    public ListNode head;
    private int size;

    public MyLinkedList() {
        head = new ListNode(-1);  
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;  
        ListNode temp = head.next;  
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        size++;
    }

    public void addAtTail(int val) {
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ListNode(val);
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size || index < 0) return;  
        ListNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;  
        ListNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        ListNode toDelete = temp.next;
        temp.next = toDelete.next;
        toDelete.next = null;  
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
