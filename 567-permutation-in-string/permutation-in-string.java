class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        int match = 0, ans = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (hm1.containsKey(s1.charAt(i))) {
                hm1.put(s1.charAt(i), hm1.get(s1.charAt(i)) + 1);
            } else {
                hm1.put(s1.charAt(i), 1);
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            if (hm2.containsKey(s2.charAt(i))) {
                hm2.put(s2.charAt(i), hm2.get(s2.charAt(i)) + 1);
            } else {
                hm2.put(s2.charAt(i), 1);
            }
            if (hm1.containsKey(s2.charAt(i)) && hm2.get(s2.charAt(i)) <= hm1.get(s2.charAt(i))) {
                match++;
            }
        }
        if (match == s1.length()) {
            ans++;
        }
        int p1 = 1, p2 = s1.length();
        while (p2 < s2.length()) {
            char drop = s2.charAt(p1 - 1);
            if (hm1.containsKey(drop) && hm2.get(drop) <= hm1.get(drop)) {
                match--;
            }
            hm2.put(drop, hm2.get(drop) - 1);
            if (hm2.get(drop) == 0) {
                hm2.remove(drop);
            }
            char addNew = s2.charAt(p2);
            if (hm2.containsKey(addNew)) {
                hm2.put(addNew, hm2.get(addNew) + 1);
            } else {
                hm2.put(addNew, 1);
            }
            if (hm1.containsKey(addNew) && hm2.get(addNew) <= hm1.get(addNew)) {
                match++;
            }
            if (match == s1.length())
                ans++;
            p2++;
            p1++;
        }
        return ans > 0 ? true : false;
    }
}