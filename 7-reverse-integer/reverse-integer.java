class Solution {
    public int reverse(int x) {
        String data = Integer.toString(x);
        StringBuilder sb = new StringBuilder(data);
        if (sb.charAt(0) == '-') {
            StringBuilder sb1 = new StringBuilder(sb.substring(1, sb.length()));
            if (Long.parseLong(sb1.reverse().toString()) > Math.pow(2, 31)) {
                return 0;
            } else {
                return -Integer.parseInt(sb1.toString());
            }
        } else {
            if (Long.parseLong(sb.reverse().toString()) > Math.pow(2, 31)) {
                return 0;
            } else {
                return Integer.parseInt(sb.toString());
            }
        }
    }
}