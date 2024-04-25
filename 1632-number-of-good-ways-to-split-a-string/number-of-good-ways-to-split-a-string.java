class Solution {
    public int numSplits(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }
        int count = 0;
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i)) && hm.get(s.charAt(i)) > 0) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) - 1);
            }
            if (hm.get(s.charAt(i)) == 0) {
                hm.remove(s.charAt(i));
            }
            hs.add(s.charAt(i));
            if (hm.size() == hs.size()) {
                count++;
            }
        }
        return count;
    }
}