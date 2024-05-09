class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int j = 0;
        long sum = 0;
        int length = happiness.length;
        while (length > 0 && happiness[length - 1] > 0 && k > 0) {
            sum += happiness[length - 1];
            j++;
            k--;
            length--;
            if (length > 0) {
                happiness[length - 1] = happiness[length - 1] - j;
            }
        }
        return sum;
    }
}