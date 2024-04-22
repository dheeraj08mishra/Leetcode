class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder(word1.length() + word2.length());
        int pointer1 = 0, pointer2 = 0;
        while (pointer1 < word1.length() && pointer2 < word2.length()) {
            ans.append(word1.charAt(pointer1++));
            ans.append(word2.charAt(pointer2++));
        }
        while (pointer1 < word1.length()) {
            ans.append(word1.charAt(pointer1++));
        }
        while (pointer2 < word2.length()) {
            ans.append(word2.charAt(pointer2++));
        }
        return ans.toString();
    }
}