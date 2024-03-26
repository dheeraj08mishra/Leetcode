class Solution {

  public int[] solve(int[] A) {
    insertion(A);
    return A;
  }

  private static int[] insertion(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (nums[j] > nums[j + 1]) {
          swap(nums, j, j + 1);
        } else {
          break;
        }
      }
    }
    return nums;
  }

  private static int[] swap(int[] nums, int j, int i) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
    return nums;
  }
}
