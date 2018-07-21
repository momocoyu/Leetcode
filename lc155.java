class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
   
    public MinStack() {
        
    }
    
    public void push(int x) {

        s1.push(x);
        if(s2.empty()|| x<=s2.peek()) s2.push(x);
        else s2.push(s2.peek());
    }
    
    public void pop() {
        s1.pop();
        s2.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
