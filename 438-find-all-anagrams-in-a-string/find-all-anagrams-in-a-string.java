class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> al = new ArrayList<>();
        if (p.length() > s.length()) {
            return al;
        }

        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        int match = 0;

        for (int i = 0; i < p.length(); i++) {
            if (hm1.containsKey(p.charAt(i))) {
                hm1.put(p.charAt(i), hm1.get(p.charAt(i)) + 1);
            } else {
                hm1.put(p.charAt(i), 1);
            }
        }
        for (int i = 0; i < p.length(); i++) {
            if (hm2.containsKey(s.charAt(i))) {
                hm2.put(s.charAt(i), hm2.get(s.charAt(i)) + 1);
            } else {
                hm2.put(s.charAt(i), 1);
            }
            if (hm1.containsKey(s.charAt(i)) && hm2.get(s.charAt(i)) <= hm1.get(s.charAt(i))) {
                match++;
            }
        }
        if (match == p.length()) {
            al.add(0);
        }
        int p1 = 1, p2 = p.length();
        while (p2 < s.length()) {
            char drop = s.charAt(p1 - 1);
            if (hm1.containsKey(drop) && hm2.get(drop) <= hm1.get(drop)) {
                match--;
            }
            hm2.put(drop, hm2.get(drop) - 1);
            if (hm2.get(drop) == 0) {
                hm2.remove(drop);
            }
            char addNew = s.charAt(p2);
            if (hm2.containsKey(addNew)) {
                hm2.put(addNew, hm2.get(addNew) + 1);
            } else {
                hm2.put(addNew, 1);
            }
            if (hm1.containsKey(addNew) && hm2.get(addNew) <= hm1.get(addNew)) {
                match++;
            }
            if (match == p.length())
                al.add(p1);
            p2++;
            p1++;
        }
        return al;
    }
}