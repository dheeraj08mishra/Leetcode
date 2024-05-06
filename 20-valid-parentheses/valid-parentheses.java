class Solution {
    public boolean isValid(String s) {
        // Stack<Character> stack = new Stack<>();
        // for (int i = 0; i < s.length(); i++) {
        // if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
        // stack.push(s.charAt(i));
        // } else {
        // if (stack.isEmpty()) {
        // if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']') {
        // return false;
        // }
        // }
        // if (s.charAt(i) == '}') {
        // if (stack.peek() == '{') {
        // stack.pop();
        // } else {
        // stack.push(s.charAt(i));
        // }
        // }
        // if (s.charAt(i) == ')') {
        // if (stack.peek() == '(') {
        // stack.pop();
        // } else {
        // stack.push(s.charAt(i));
        // }
        // }
        // if (s.charAt(i) == ']') {
        // if (stack.peek() == '[') {
        // stack.pop();
        // } else {
        // stack.push(s.charAt(i));
        // }
        // }
        // }
        // }
        // if (!stack.isEmpty()) {
        // return false;
        // } else {
        // return true;
        // }

        if (s.charAt(0) == '}' || s.charAt(0) == ')' || s.charAt(0) == ']')
            return false;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty()) {
                // if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                    st.push(s.charAt(i));
                // }
            } else {
                if (s.charAt(i) == ']' && st.peek() == '[') {
                    st.pop();
                } else if (s.charAt(i) == '}' && st.peek() == '{') {
                    st.pop();
                } else if (s.charAt(i) == ')' && st.peek() == '(') {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            }

        }
        if (st.isEmpty())
            return true;
        else
            return false;

    }
}
