class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==2) return n;
        int[] arrayDp = new int[n + 1];
        Arrays.fill(arrayDp, -1);
        arrayDp[1] = 1;
        arrayDp[2] = 2;
        for (int i = 3; i <= n; i++) {
            arrayDp[i] = arrayDp[i - 1] + arrayDp[i - 2];
        }
        return arrayDp[n];
    }
}