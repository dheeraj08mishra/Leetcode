class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty()) {
                st.push(s.charAt(i));
            } else {
                if (s.charAt(i) != ')') {
                    st.push(s.charAt(i));
                } else {
                    StringBuilder str = new StringBuilder();
                    while (st.peek() != '(') {
                        str.append(st.pop());
                    }
                    st.pop();
                    int count = 0;
                    while (count != str.length()) {
                        st.push(str.charAt(count));
                        count++;
                    }
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}