class Solution {
    public int maxProduct(int[] nums) {
        /// using sorting
        // Arrays.sort(nums);
        // return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);

        // without sorting
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstMaxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstMax) {
                firstMax = nums[i];
                firstMaxIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secondMax && secondMax <= firstMax && firstMaxIndex != i) {
                secondMax = nums[i];
            }
        }

        return (firstMax - 1) * (secondMax - 1);
    }
}