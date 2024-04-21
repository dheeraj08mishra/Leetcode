class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0; i < citations.length / 2; i++) {
            int temp = citations[i];
            citations[i] = citations[citations.length - i - 1];
            citations[citations.length - i - 1] = temp;
        }
        int max = 0;
        for (int i = 0; i < citations.length; i++) {
            if (i + 1 <= citations[i]) {
                max = Math.max(max, i + 1);
            }
        }

        return max;
    }
}