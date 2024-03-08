class BrowserHistory {
    Stack<String>str ;
    Stack<String> prev = new Stack<>();
    public BrowserHistory(String homepage) {
        str = new Stack<>();
        str.push(homepage);
    }
    
    public void visit(String url) {
        prev.clear();
        str.push(url);
    }
    
    public String back(int steps) {
        
        String a = "";
        for(int i = 0;i<steps && str.size()>1;i++){
            a = str.pop();
            prev.push(a);
        }
        return str.peek();
        
    }
    
    public String forward(int steps) {
        String a = "";
        for(int i = 0;i<steps && !prev.isEmpty();i++){
            a = prev.pop();
            str.push(a);
        }
        return str.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */