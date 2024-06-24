class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = 0;
        return lcs(text1, text2, text1.length() - 1, text2.length() - 1, dp, ans);
    }

    public static int lcs(String text1, String text2, int n1, int n2, int[][] dp, int ans) {
        if (n2 < 0 || n1 < 0)
            return 0;
        if (dp[n1][n2] == -1) {
            if (text1.charAt(n1) == text2.charAt(n2)) {
                ans = lcs(text1, text2, n1 - 1, n2 - 1, dp, ans) + 1;
            } else {
                int a = lcs(text1, text2, n1 - 1, n2, dp, ans);
                int b = lcs(text1, text2, n1, n2 - 1, dp, ans);
                ans = Math.max(a, b);
            }
            dp[n1][n2] = ans;
        } else {
            return dp[n1][n2];
        }

        return ans;
    }
}