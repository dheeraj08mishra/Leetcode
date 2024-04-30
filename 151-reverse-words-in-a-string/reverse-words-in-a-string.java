class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        String result = String.join(" ", words);
        return result.trim();
    }
}