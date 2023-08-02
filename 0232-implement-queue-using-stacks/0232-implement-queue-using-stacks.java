class MyQueue {
    Stack<Integer> q;
    Stack<Integer> hq;
    
    public MyQueue() {
        q = new Stack<>();
        hq = new Stack<>();
    }
    
    public void push(int x) {
        q.push(x);
    }
    
    public int pop() {
        if(q.size()==0){return -1;}
        
        while(q.size()!=1){
            int s = q.pop();
            hq.push(s);
        }
        int m =  q.pop();
        while(hq.size()!=0){
            int s = hq.pop();
            q.push(s);
        }
        return m;
    }
    
    public int peek() {
        if(q.size()==0){return -1;}
        
        while(q.size()!=1){
            int s = q.pop();
            hq.push(s);
        }
        int m =  q.pop();
        hq.push(m);
        while(hq.size()!=0){
            int s = hq.pop();
            q.push(s);
        }
        return m;
    }
    
    public boolean empty() {
        if(q.size()==0){return true;}return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */