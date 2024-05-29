class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;

    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            if (st.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            st.pop();
        }

    }

    public int top() {
        if (st.isEmpty())
            return -1;
        return st.peek();

    }

    public int getMin() {
        if (minStack.isEmpty())
            return -1;
        return minStack.peek();

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */