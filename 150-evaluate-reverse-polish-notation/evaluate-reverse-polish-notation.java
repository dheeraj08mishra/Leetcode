class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                st.push(st.pop() + st.pop());
            } else if (tokens[i].equals("-")) {
                int val1 = st.pop();
                int val2 = st.pop();
                st.push(val2 - val1);
            } else if (tokens[i].equals("*")) {
                st.push(st.pop() * st.pop());
            } else if (tokens[i].equals("/")) {
                int val1 = st.pop();
                int val2 = st.pop();
                st.push(val2 / val1);
            } else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}