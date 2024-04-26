class Solution {
    public String longestPalindrome(String s) {
        String odd_length = "", even_length = "";

        // for odd there will be one center i
        for (int i = 0; i < s.length(); i++) {
            int p1 = i, p2 = i;
            String temp = expand(s, p1, p2);
            if (temp.length() > odd_length.length()) {
                odd_length = temp;
            }
        }

        // for even there will 2 center i , i+1;
        for (int i = 0; i < s.length() - 1; i++) {
            int p1 = i, p2 = i + 1;
            String temp = expand(s, p1, p2);
            if (temp.length() > even_length.length()) {
                even_length = temp;
            }
        }
        return even_length.length() > odd_length.length() ? even_length : odd_length;
    }

    private static String expand(String str, int p1, int p2) {
        while (p1 >= 0 && p2 < str.length() && str.charAt(p1) == str.charAt(p2)) {
            p1--;
            p2++;
        }
        return str.substring(p1 + 1, p2);
    }

}