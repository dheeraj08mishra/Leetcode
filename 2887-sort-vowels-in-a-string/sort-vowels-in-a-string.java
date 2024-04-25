class Solution {
    public String sortVowels(String s) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'E'
                    || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'U') {
                al.add((int) (s.charAt(i)));
            }
        }
        Collections.sort(al);
        int counter = 0;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'E'
                    || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'U') {
                sb.setCharAt(i, (char) (int) al.get(counter));
                counter++;

            }
        }
        return sb.toString();
    }
}