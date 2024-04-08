class Solution {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            boolean check = checkPalin(words[i]);
            if (check == true) {
                return words[i];
            }
        }
        return "";
    }

    private static boolean checkPalin(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}