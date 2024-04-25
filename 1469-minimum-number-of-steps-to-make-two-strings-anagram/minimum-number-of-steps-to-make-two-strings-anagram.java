class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> hms = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hms.containsKey(s.charAt(i))) {
                hms.put(s.charAt(i), hms.get(s.charAt(i)) + 1);
            } else {
                hms.put(s.charAt(i), 1);
            }
        }
        int ans = 0;
        for (int i = 0; i < t.length(); i++) {
            if (hms.containsKey(t.charAt(i)) && hms.get(t.charAt(i)) > 0) {
                hms.put(t.charAt(i), hms.get(t.charAt(i)) - 1);
            } else {
                ans++;
            }
        }
        return ans;
    }
}