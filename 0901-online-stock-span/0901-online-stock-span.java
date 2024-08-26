class StockSpanner {
    
    public class cont{
        int val;int cur = 1;
        cont(int val, int cur){
            this.val = val;
            this.cur = cur;
        }
    }
    Stack<cont>st;

    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        if(st.size() == 0){st.push(new cont(price,1));return 1;}
        int a = 1;
        while(st.size()>0 && st.peek().val <= price){
            a+=st.pop().cur;
        }
        st.push(new cont(price,a));
        return a;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */