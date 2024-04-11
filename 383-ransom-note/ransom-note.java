class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> rans = new HashMap<>();
        HashMap<Character, Integer> mag = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (mag.containsKey(magazine.charAt(i))) {
                mag.put(magazine.charAt(i), mag.get(magazine.charAt(i)) + 1);
            } else {
                mag.put(magazine.charAt(i), 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (rans.containsKey(ransomNote.charAt(i))) {
                rans.put(ransomNote.charAt(i), rans.get(ransomNote.charAt(i)) + 1);
            } else {
                rans.put(ransomNote.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : rans.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            if (mag.containsKey(key)) {
                if (value > mag.get(key)) {
                    return false;
                }

            } else {
                return false;
            }
        }
        return true;
    }
}