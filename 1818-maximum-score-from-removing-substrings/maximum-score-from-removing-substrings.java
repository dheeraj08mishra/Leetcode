class Solution {
    public int maximumGain(String s, int x, int y) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        int total = 0;
        if (x > y) {
            for (int i = 0; i < s.length(); i++) {
                if (st.isEmpty()) {
                    st.push(s.charAt(i));
                } else {
                    if (s.charAt(i) == 'b' && st.peek() == 'a') {
                        st.pop();
                        total += x;
                    } else {
                        st.push(s.charAt(i));
                    }
                }
            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (st.isEmpty()) {
                    st.push(s.charAt(i));
                } else {
                    if (s.charAt(i) == 'a' && st.peek() == 'b') {
                        st.pop();
                        total += y;
                    } else {
                        st.push(s.charAt(i));
                    }
                }
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();
        if (x > y) {
            for (int i = 0; i < sb.length(); i++) {
                if (st.isEmpty()) {
                    st.push(sb.charAt(i));
                } else {
                    if (sb.charAt(i) == 'a' && st.peek() == 'b') {
                        st.pop();
                        total += y;
                    } else {
                        st.push(sb.charAt(i));
                    }
                }
            }

        } else {
            for (int i = 0; i < sb.length(); i++) {
                if (st.isEmpty()) {
                    st.push(sb.charAt(i));
                } else {
                    if (sb.charAt(i) == 'b' && st.peek() == 'a') {
                        st.pop();
                        total += x;
                    } else {
                        st.push(sb.charAt(i));
                    }
                }
            }
        }

        return total;
    }
}