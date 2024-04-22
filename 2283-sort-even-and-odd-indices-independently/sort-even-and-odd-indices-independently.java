class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] odd = new int[nums.length / 2];
        int[] even = new int[nums.length - odd.length];
        int evenCounter = 0, oddCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even[evenCounter++] = nums[i];
            } else {
                odd[oddCounter++] = nums[i];
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        for (int i = 0; i < odd.length / 2; i++) {
            int temp = odd[i];
            odd[i] = odd[odd.length - 1 - i];
            odd[odd.length - 1 - i] = temp;
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