class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty() && s.charAt(i) != '#') {
                st.add(s.charAt(i));
            } else {
                if (s.charAt(i) == '#' && st.size() > 0) {
                    st.pop();
                } else if (s.charAt(i) != '#') {
                    st.add(s.charAt(i));
                }
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (st1.isEmpty() && t.charAt(i) != '#') {
                st1.add(t.charAt(i));
            } else {
                if (t.charAt(i) == '#' && st1.size() > 0) {
                    st1.pop();
                } else if (t.charAt(i) != '#') {
                    st1.add(t.charAt(i));
                }
            }
        }
        while (!st.isEmpty()) {
            str1.insert(0, st.pop());
        }
        while (!st1.isEmpty()) {
            str2.insert(0, st1.pop());
        }
        return str1.reverse().toString().equals(str2.reverse().toString());
    }
}