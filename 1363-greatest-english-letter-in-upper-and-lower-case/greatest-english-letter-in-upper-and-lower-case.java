class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            hs.add(s.charAt(i));
        }
        StringBuilder greater = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                if (hs.contains(s.charAt(i)) && hs.contains(Character.toUpperCase(s.charAt(i)))) {
                    if (greater.toString().length() == 0) {
                        greater.append(Character.toUpperCase(s.charAt(i)));
                    } else {
                        char temp = (char) (Math.max((int) greater.toString().charAt(0),
                                (int) Character.toUpperCase(s.charAt(i))));
                        greater.setCharAt(0, Character.toUpperCase(temp));

                    }

                }
            }

        }
        return greater.toString();
    }
}