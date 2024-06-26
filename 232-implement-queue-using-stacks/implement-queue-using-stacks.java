class MyQueue {

    Stack<Integer> st1;
    Stack<Integer> st2;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        st1.push(x);
    }

    public int pop() {
        if (st2.isEmpty()) {
            if (st1.isEmpty())
                return -1;
            else {
                while (!st1.isEmpty()) {
                    st2.push(st1.pop());
                }
                return st2.pop();
            }
        } else {
            return st2.pop();
        }
    }

    public int peek() {
        if (st1.isEmpty()) {
            if (!st2.isEmpty()) {
                return st2.peek();
            }
        } else {
            if (st2.isEmpty()) {
                while (!st1.isEmpty()) {
                    st2.push(st1.pop());
                }
                return st2.peek();
            }

        }
        return st2.peek();
    }

    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
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