class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        char ans = 'a';
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                ans = s.charAt(i);
                return s.charAt(i);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }
        return ans;
    }
}