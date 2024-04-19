class Solution {
    public int maxProfit(int[] prices) {
        int[] prefMax = new int[prices.length];
        prefMax[prefMax.length - 1] = 0;
        for (int i = prices.length - 2; i >= 0; i--) {
            prefMax[i] = Math.max(prefMax[i + 1], prices[i + 1]);
        }
        int max = 0;
        for (int i = 0; i < prefMax.length; i++) {
            max = Math.max(max, prefMax[i] - prices[i]);
        }
        return max;
    }
}