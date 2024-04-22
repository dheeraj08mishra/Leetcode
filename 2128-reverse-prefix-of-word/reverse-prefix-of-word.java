class Solution {
    public String reversePrefix(String word, char ch) {
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        if (index == -1)
            return word;
        StringBuilder ans = new StringBuilder(word);
        for (int i = 0; i <= index / 2; i++) {
            char temp = ans.charAt(i);
            ans.setCharAt(i, ans.charAt(index - i));
            ans.setCharAt(index - i, temp);
        }
        return ans.toString();
    }
}