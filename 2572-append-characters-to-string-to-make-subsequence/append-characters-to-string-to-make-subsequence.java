class Solution {
    public int appendCharacters(String s, String t) {
        int pointer1 = 0, pointer2 = 0;
        while (pointer1 < s.length() && pointer2 < t.length()) {
            if (s.charAt(pointer1) == t.charAt(pointer2)) {
                pointer2++;
                pointer1++;
            } else {
                pointer1++;
            }
        }
        return t.length() - pointer2;
    }
}