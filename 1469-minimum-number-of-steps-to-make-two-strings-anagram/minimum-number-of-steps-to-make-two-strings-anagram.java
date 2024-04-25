class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> hms = new HashMap<>();
        HashMap<Character, Integer> hmt = new HashMap<>();
        HashSet<Character> hst = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (hms.containsKey(s.charAt(i))) {
                hms.put(s.charAt(i), hms.get(s.charAt(i)) + 1);
            } else {
                hms.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            hst.add(t.charAt(i));
            if (hmt.containsKey(t.charAt(i))) {
                hmt.put(t.charAt(i), hmt.get(t.charAt(i)) + 1);
            } else {
                hmt.put(t.charAt(i), 1);
            }
        }
        int ans = 0;
        for (Character current : hst) {
            if (hmt.containsKey(current) && hms.containsKey(current)) {
                if (hms.get(current) < hmt.get(current)) {
                    ans += -hms.get(current) + hmt.get(current);
                }
            } else {
                ans += hmt.get(current);
            }
        }
        return ans;
    }
}