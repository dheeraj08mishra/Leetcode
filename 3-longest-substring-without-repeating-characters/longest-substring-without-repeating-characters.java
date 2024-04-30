class Solution {
    public int lengthOfLongestSubstring(String s) {
        int p1 = 0, p2 = 0;
        int ans = 0;
        HashSet<Character> hs = new HashSet<>();
        while (p2 < s.length()) {
            if (hs.contains(s.charAt(p2))) {
                hs.remove(s.charAt(p1));
                p1++;
            } else {
                hs.add(s.charAt(p2));
                p2++;
                ans = Math.max(ans, hs.size());
            }
        }
        return ans;
    }
}