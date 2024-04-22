class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] even = new int[nums.length / 2];
        int[] odd = new int[nums.length / 2];
        int evenCounter = 0, oddCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even[evenCounter++] = nums[i];
            } else {
                odd[oddCounter++] = nums[i];
            }
        }
        int evenRemain = evenCounter;
        int oddRemain = oddCounter;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even[evenCounter - evenRemain];
                evenRemain--;
            } else {
                nums[i] = odd[oddCounter - oddRemain];
                oddRemain--;
            }
        }
        return nums;
    }
}