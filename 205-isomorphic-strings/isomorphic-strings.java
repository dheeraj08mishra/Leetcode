class Solution {
    public boolean isIsomorphic(String s, String t) {
        boolean isomporphic = true;
        HashMap<Character, Character> hm1 = new HashMap<>();
        HashMap<Character, Boolean> hm2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm1.containsKey(s.charAt(i))) {
                if (hm1.get(s.charAt(i)) != t.charAt(i)) {
                    isomporphic = false;
                    break;
                }
            } else {

                if (hm2.containsKey(t.charAt(i))) {
                    isomporphic = false;
                    break;
                } else {
                    hm1.put(s.charAt(i), t.charAt(i));
                    hm2.put(t.charAt(i), true);
                }

                hm1.put(s.charAt(i), t.charAt(i));
            }

        }
        return isomporphic;
    }
}