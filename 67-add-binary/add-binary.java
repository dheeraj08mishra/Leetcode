class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int counter1 = a.length() - 1, counter2 = b.length() - 1;
        while (counter1 >= 0 || counter2 >= 0) {
            int sum = carry;
            if (counter1 >= 0) {
                sum += a.charAt(counter1--) - '0';
            }
            if (counter2 >= 0) {
                sum += b.charAt(counter2--) - '0';
            }
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if (carry != 0)
            res.append(carry);
        return res.reverse().toString();
    }
}