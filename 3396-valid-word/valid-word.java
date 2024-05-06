class Solution {
    public boolean isValid(String word) {
        boolean lengthFlag = false, vowelFlag = false, consonant = false;
        if (word.length() < 3) {
            lengthFlag = false;
            return false;
        } else {
            lengthFlag = true;
        }
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetterOrDigit(word.charAt(i))) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                        || word.charAt(i) == 'u'
                        || word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I'
                        || word.charAt(i) == 'O' || word.charAt(i) == 'U') {
                    vowelFlag = true;
                } else if (Character.isLetter(word.charAt(i))) {
                    consonant = true;
                }
            } else {
                return false;
            }
        }
        return lengthFlag && consonant && vowelFlag;
    }
}