class CustomStack {

    int[]st;int p = 0;
    public CustomStack(int maxSize) {
        st = new int[maxSize];
    }
    
    public void push(int x) {
        if(p<st.length){st[p] = x;p++;}
    }
    
    public int pop() {
        if(p!=0){p--;return st[p];}
        return -1;
    }
    
    public void increment(int k, int val) {
        for(int i = 0;i<k && i<p;i++){
            st[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */