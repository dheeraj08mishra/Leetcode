class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int counter = 0;
        int n = arr.length;
        int[][] ratios = new int[((n * (n - 1)) / 2)][2];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                ratios[counter][0] = arr[i];
                ratios[counter][1] = arr[j];
                counter++;
            }
        }
        Arrays.sort(ratios, (a, b) -> Double.compare((double) a[0] / a[1], (double) b[0] / b[1]));
        return ratios[k - 1];
    }
}