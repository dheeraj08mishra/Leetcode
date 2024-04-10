class Solution {
    public int maximumCount(int[] nums) {

        /*
         * brute force linear search
         * int positiveCount = 0;
         * int negativeCount = 0;
         * for (int i = 0; i < nums.length; i++) {
         * if (nums[i] > 0) {
         * positiveCount++;
         * } else if (nums[i] < 0) {
         * negativeCount++;
         * }
         * }
         * return Math.max(positiveCount, negativeCount);
         */

        // binary search for negative

        int countZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZero++;
            }
        }
        int negativeCount = 0;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < 0) {
                negativeCount = mid + 1;
                low = mid + 1;
            } else if (nums[mid] > 0) {
                high = mid - 1;
            } else {
                high = mid - 1;
            }

        }
        return Math.max((nums.length - countZero - negativeCount), negativeCount);

    }
}