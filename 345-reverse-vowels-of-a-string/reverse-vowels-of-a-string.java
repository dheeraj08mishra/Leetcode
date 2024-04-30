class Solution {
    public String reverseVowels(String s) {
        ArrayList<Integer> al = new ArrayList();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U') {
                al.add(i);
            }
        }
        for (int i = 0; i < al.size() / 2; i++) {
            Character temp = sb.charAt(al.get(i));
            sb.setCharAt(al.get(i), sb.charAt(al.get(al.size() - i - 1)));
            sb.setCharAt(al.get(al.size() - i - 1), temp);
        }
        return sb.toString();
    }
}