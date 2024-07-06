class Solution {
    public int passThePillow(int n, int time) {
        if ((time / (n - 1)) % 2 == 0) {
            int timeDiv = time / (n - 1);
            int rem = time % (n - 1);
            return 1+rem;
        } else {
            int timeDiv = time / (n - 1);
            int rem = time % (n - 1);
            return n - rem;
        }
    }
}