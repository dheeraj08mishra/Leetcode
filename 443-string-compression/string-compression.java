class Solution {
    public int compress(char[] chars) {
        int p1 = 0, p2 = 0, count = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(chars[p1]);
        while (p2 < chars.length) {
            if (chars[p1] == chars[p2]) {
                count++;
                p2++;
            } else {
                if (count != 1) {
                    sb.append(count);
                }
                p1 = p2;
                count = 0;
                sb.append(chars[p1]);
            }
        }
        if (count != 1) {
            sb.append(count);
        }
        for (int i = 0; i < sb.toString().length(); i++) {
            chars[i] = sb.charAt(i);
        }
        return sb.toString().length();
    }
}