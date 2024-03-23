class Solution {
    public int differenceOfSum(int[] nums) {
        int digitSum = 0;
        int digit = 0;
        int elementSum = 0;
        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            if (nums[i] > 9) {
                while (nums[i] > 0) {
                    digit = nums[i] % 10;
                    sum = sum + digit;
                    nums[i] = nums[i] / 10;
                }
                digitSum += sum;
            } else {
                digitSum += nums[i];
            }
        }

        return Math.abs(elementSum - digitSum);

    }

}