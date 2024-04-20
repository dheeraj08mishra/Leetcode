class Solution {
    public void sortColors(int[] nums) {
        int countZero = 0, countOne = 0, countTwo = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZero++;
            } else if (nums[i] == 1) {
                countOne++;
            } else if (nums[i] == 2) {
                countTwo++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < countZero) {
                nums[i] = 0;
            } else if (i < countZero + countOne) {
                nums[i] = 1;
            } else if (i < countZero + countOne + countTwo) {
                nums[i] = 2;
            }
        }

    }
}