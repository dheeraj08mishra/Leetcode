class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty()) {
                st.push(s.charAt(i));
            } else {
                if (s.charAt(i) == st.peek()) {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            }
        }
        StringBuilder str = new StringBuilder();
        while (!st.empty()){
            str.insert(0,st.pop());
        }
        return str.toString();
    }
}