class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        int[] leftPrefix = new int[boxes.length()];
        int[] rightPrefix = new int[boxes.length()];
        int c = boxes.charAt(0) - '0';
        for (int i = 1; i < boxes.length(); i++) {
            leftPrefix[i] = leftPrefix[i - 1] + c;
            c += boxes.charAt(i) - '0';
        }
        c = boxes.charAt(boxes.length() - 1) - '0';
        for (int i = boxes.length() - 2; i >= 0; i--) {
            rightPrefix[i] = rightPrefix[i + 1] + c;
            c += boxes.charAt(i) - '0';
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = rightPrefix[i] + leftPrefix[i];
        }
        return ans;
    }
}