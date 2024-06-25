class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = 0;
        return ed(word1, word2, word1.length() - 1, word2.length() - 1, dp, ans);
    }

    public static int ed(String text1, String text2, int n1, int n2, int[][] dp, int ans) {
        if (n2 < 0 && n1 < 0)
            return 0;
        if (n1 < 0)
            return n2 + 1;
        if (n2 < 0)
            return n1 + 1;
        if (dp[n1][n2] == -1) {
            if (text1.charAt(n1) == text2.charAt(n2)) {
                ans = ed(text1, text2, n1 - 1, n2 - 1, dp, ans);
            } else {
                int a = ed(text1, text2, n1 - 1, n2, dp, ans);
                int b = ed(text1, text2, n1, n2 - 1, dp, ans);
                int c = ed(text1, text2, n1 - 1, n2 - 1, dp, ans);
                ans = Math.min(a, Math.min(b, c)) + 1;
            }
            dp[n1][n2] = ans;
        } else {
            return dp[n1][n2];
        }

        return ans;
    }
}