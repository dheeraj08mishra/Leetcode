class Solution {
    public int numSquares(int n) {
        if (n == 0 || n == 1)
            return n;
        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 1; i <= n; i++) {
            int ans = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                ans = Math.min(arr[i - (j * j)], ans);
            }
            arr[i] = ans + 1;
        }
        return arr[n];
    }
}