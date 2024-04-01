class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                len = 0;
            } else if (s.charAt(i) != ' ') {
                len++;
            }
        }
        return len;
    }
}