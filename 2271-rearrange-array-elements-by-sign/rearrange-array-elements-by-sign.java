class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positiveArray = new int[nums.length / 2];
        int[] negativeArray = new int[nums.length / 2];
        int positiveCounter = 0, negativeCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positiveArray[positiveCounter++] = nums[i];
            } else {
                negativeArray[negativeCounter++] = nums[i];
            }
        }
        int positiveRemain = positiveCounter;
        int negativeRemain = negativeCounter;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = positiveArray[positiveCounter - positiveRemain];
                positiveRemain--;
            } else {
                nums[i] = negativeArray[negativeCounter - negativeRemain];
                negativeRemain--;
            }
        }
        return nums;
    }
}