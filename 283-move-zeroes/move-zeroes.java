class Solution {
    public void moveZeroes(int[] nums) {
        int countZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZero++;
            }
        }
        int[] output = new int[nums.length];
        int[] notZero = new int[nums.length - countZero];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                notZero[index++] = nums[i];
            }

        }
        for (int i = 0; i < nums.length; i++) {
            if (i < index) {
                nums[i] = notZero[i];
            } else {
                nums[i] = 0;
            }

        }

    }
}