class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty()) {
                st.push(s.charAt(i));
            } else {
                if (Character.isUpperCase(s.charAt(i))) {
                    if (Character.isLowerCase(st.peek())) {
                        if (Character.toUpperCase(st.peek()) == s.charAt(i)) {
                            st.pop();
                        } else {
                            st.push(s.charAt(i));
                        }
                    } else {
                        st.push(s.charAt(i));
                    }
                } else {
                    if (Character.isUpperCase(st.peek())) {
                        if (Character.toLowerCase(st.peek()) == s.charAt(i)) {
                            st.pop();
                        } else {
                            st.push(s.charAt(i));
                        }
                    } else {
                        st.push(s.charAt(i));
                    }
                }

            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.insert(0, st.pop());
        }
        return ans.toString();
    }
}