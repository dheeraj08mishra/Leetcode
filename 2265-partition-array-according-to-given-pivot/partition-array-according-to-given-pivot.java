class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int counter = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                ans[counter++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                ans[counter++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                ans[counter++] = nums[i];
            }
        }

        return ans;
    }
}