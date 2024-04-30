class Solution {
    public boolean isAnagram(String s, String t) {
        char array1[] = s.toCharArray();
        char array2[] = t.toCharArray();
        Arrays.sort(array1);
        s = new String(array1);
        Arrays.sort(array2);
        t = new String(array2);
        return s.equals(t);

        // HashMap<Character, Integer> hm1 = new HashMap<>();
        // HashMap<Character, Integer> hm2 = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     if (hm1.containsKey(s.charAt(i))) {
        //         hm1.put(s.charAt(i), hm1.get(s.charAt(i)) + 1);
        //     } else {
        //         hm1.put(s.charAt(i), 1);
        //     }
        // }
        // for (int i = 0; i < t.length(); i++) {
        //     if (hm2.containsKey(t.charAt(i))) {
        //         hm2.put(t.charAt(i), hm2.get(t.charAt(i)) + 1);
        //     } else {
        //         hm2.put(t.charAt(i), 1);
        //     }
        // }
        // for (int i = 0; i < s.length(); i++) {
        //     if (hm1.containsKey(s.charAt(i)) && hm2.containsKey(s.charAt(i))) {
        //         hm1.put(s.charAt(i), hm1.get(s.charAt(i)) - 1);
        //         hm2.put(s.charAt(i), hm2.get(s.charAt(i)) - 1);
        //         if (hm1.get(s.charAt(i)) == 0) {
        //             hm1.remove(s.charAt(i));
        //         }
        //         if (hm2.get(s.charAt(i)) == 0) {
        //             hm2.remove(s.charAt(i));
        //         }
        //     } else {
        //         return false;
        //     }
        // }

        // return hm1.size() == hm2.size();
    }
}