class MyQueue {
    private List<Integer> arr;
    public MyQueue() {
        this.arr = new ArrayList<>();
    }

    public void push(int x) {
        arr.add(x);
    }

    public int pop() {
        int a = arr.get(0);
        arr.remove(0);
        return a;
    }

    public int peek() {
        return arr.get(0);
    }

    public boolean empty() {
        return arr.size() == 0;
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