class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                if (!hm.containsKey(Character.toUpperCase(word.charAt(i)))) {
                    hm.put(word.charAt(i), i);
                } else {
                    hm.put(Character.toUpperCase(word.charAt(i)), -1);
                }
            }
            if (Character.isUpperCase(word.charAt(i))) {
                if (hm.containsKey(Character.toLowerCase(word.charAt(i)))
                        && hm.get(Character.toLowerCase(word.charAt(i))) < i) {
                    if (hm.containsKey(word.charAt(i)) && (hm.get(word.charAt(i)) != -1)) {
                        hm.put(word.charAt(i), i);
                    } else if (!hm.containsKey(word.charAt(i))) {
                        hm.put(word.charAt(i), i);
                    }

                } else {
                    hm.put((word.charAt(i)), -1);
                }
            }
        }
        int count = 0;
        for (Map.Entry<Character, Integer> set : hm.entrySet()) {
            if (Character.isLowerCase(set.getKey())) {
                Integer upperCaseIndex = hm.get(Character.toUpperCase(set.getKey()));
                Integer lowerCaseIndex = hm.get(set.getKey());
                if (upperCaseIndex != null && lowerCaseIndex != null && upperCaseIndex > lowerCaseIndex) {
                    count++;
                }
            }
        }

        return count;
    }
}