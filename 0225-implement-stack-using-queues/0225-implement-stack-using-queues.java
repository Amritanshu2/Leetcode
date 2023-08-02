class MyStack {
    Queue<Integer> q;
    Queue<Integer> hq;
     
    
    public MyStack() {
        q =new ArrayDeque<>();
        hq =new ArrayDeque<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        if(q.size()==0){return -1;}
        while(q.size()!=1){
            int s = q.remove();
            hq.add(s);
        }
        int m = q.remove();
        while(hq.size()!=0){
            int s = hq.remove();
            q.add(s);
        }
        return m;
    }
    
    public int top() {
        if(q.size()==0){return -1;}
        while(q.size()!=1){
            int s = q.remove();
            hq.add(s);
        }
        int m = q.remove();
        hq.add(m);
        while(hq.size()!=0){
            int s = hq.remove();
            q.add(s);
        }
        return m;
    }
    public boolean empty() {
        if(q.size()==0){return true;}
        return false;
    }
    
    }



/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */