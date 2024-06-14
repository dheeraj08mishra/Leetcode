class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums); // Sort the array first
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int increment = nums[i - 1] - nums[i] + 1;
                nums[i] += increment;
                count += increment;
            }
        }
        return count;
    }
}