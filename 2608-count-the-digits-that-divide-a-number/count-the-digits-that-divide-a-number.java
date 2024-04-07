class Solution {
    public int countDigits(int num) {
        int ref = num;
        int count = 0;
        while (ref > 0) {
            int rem = ref % 10;

            if (num % rem == 0) {
                count++;
            }
            ref = ref / 10;
        }
        return count;

    }
}