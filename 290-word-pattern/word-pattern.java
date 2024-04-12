class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s+"); // Split the string into words
        boolean pat = true;
        if (pattern.length() != words.length) {
            pat = false;
            return pat;
        }
        if (pat) {
            HashMap<Character, String> hm = new HashMap<>();
            HashMap<String, Character> wordPresent = new HashMap<>();
            for (int i = 0; i < pattern.length(); i++) {
                if (hm.containsKey(pattern.charAt(i))) {
                    if (!wordPresent.containsKey(words[i])) {
                        if (!hm.get(pattern.charAt(i)).equals(words[i])) {
                            pat = false;
                            return pat;
                        }
                    } else {
                        if (wordPresent.get(words[i]) != pattern.charAt(i)) {
                            pat = false;
                            return pat;
                        }

                    }

                } else {
                    if (wordPresent.size() != 0 && wordPresent.containsKey(words[i])
                            && wordPresent.get(words[i]) != pattern.charAt(i)) {
                        pat = false;
                        break;
                    } else {
                        hm.put(pattern.charAt(i), words[i]);
                        wordPresent.put(words[i], pattern.charAt(i));
                    }

                }
            }
        }
        return pat;
    }
}