class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        HashSet<Character> hm = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            hm.add(word.charAt(i));
        }
        for (Character current : hm) {
            if (Character.isLowerCase(current) && hm.contains(Character.toUpperCase(current))) {
                count++;
            }
        }
        return count;
    }
}