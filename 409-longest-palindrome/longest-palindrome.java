class Solution {
    public int longestPalindrome(String s) {
        int res = 0;
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (hs.contains(s.charAt(i))) {
                res = res + 2;
                hs.remove(s.charAt(i));
            } else {
                hs.add(s.charAt(i));
            }
        }
        if (hs.size() > 0) {
            res++;
        }
        return res;
    }

}