class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        if (num == 0 || num == 1)
            return num;
        while (num > 1) {
            if (num % 2 == 0) {
                num = num >> 1;
                count++;
            } else {
                num = num - 1;
                count++;
            }
        }
        return count + 1;

    }
}