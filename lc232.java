class MyQueue {
    Stack<Integer> inbox;
    Stack<Integer> outbox;
    /** Initialize your data structure here. */
    public MyQueue() {
        inbox = new Stack<>();
        outbox = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        inbox.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(outbox.empty()){
            while(!inbox.empty()){
                outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(outbox.empty()){
            while(!inbox.empty()){
                outbox.push(inbox.pop());
            }
        }
        return outbox.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return outbox.empty()&&inbox.empty();
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
