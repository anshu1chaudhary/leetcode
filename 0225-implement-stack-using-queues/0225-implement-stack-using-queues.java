class MyStack {

    // using a Single queue

    Queue<Integer> q1 = new LinkedList<Integer>();

    public MyStack() {
        
    }
    

    public void push(int x) {
        
        //push the element
        q1.add(x);

        //start pushing all the previous elements again to to the top
        for(int i = 0;i < q1.size() - 1; i++){
            q1.add(q1.remove());
        }
    }
    
    public int pop() {
        if(q1.isEmpty())
        return -1;
        else
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
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