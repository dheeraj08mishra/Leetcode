class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder(address);
        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) == '.') {
                ans.setCharAt(i, '[');
                ans.insert(i + 1, '.');
                ans.insert(i + 2, ']');
                i += 2;
            }
        }
        return ans.toString();
    }
}