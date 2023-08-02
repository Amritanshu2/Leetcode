class MinStack {
    Stack<Integer> st;
    public MinStack() {
        st =  new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        if(st.size()==0){return ;}
        st.pop();
    }
    
    public int top() {
        if(st.size()==0){return -1;}
        return st.peek();
    }
    
    public int getMin() {
        if(st.size()==0){return -1;}
        int arr[] = new int[st.size()];
        int i = 0,m = st.size();
        
        while(i<m){
            arr[i] = st.pop();i++;
        }
        for(int i2 = m-1;i2>=0;i2--){st.push(arr[i2]) ;}
        Arrays.sort(arr);
        return arr[0];
    }
}

