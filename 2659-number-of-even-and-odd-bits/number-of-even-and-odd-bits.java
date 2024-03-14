class Solution {
    public int[] evenOddBit(int n) {
        int[] ans = new int[2];
        int odd_count = 0;
        int even_count = 0;
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1 && count % 2 != 0) {
                odd_count++;
            } else if ((n & 1) == 1 && count % 2 == 0) {
                even_count++;
            }
            n = n >> 1;
            count++;
        }
        ans[0] = even_count;
        ans[1] = odd_count;
        return ans;
    }
}