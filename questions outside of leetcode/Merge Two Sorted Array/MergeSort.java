class Solution {

  // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
  public int[] solve(final int[] A, final int[] B) {
    int[] array = merge(A, B);
    return array;
  }

  private static int[] merge(int[] arr1, int[] arr2) {
    int[] nums = new int[arr1.length + arr2.length];
    int index = 0, pointer1 = 0, pointer2 = 0;
    while (pointer1 < arr1.length && pointer2 < arr2.length) {
      if (arr1[pointer1] < arr2[pointer2]) {
        nums[index] = arr1[pointer1];
        index++;
        pointer1++;
      } else if (arr1[pointer1] > arr2[pointer2]) {
        nums[index] = arr2[pointer2];
        index++;
        pointer2++;
      } else if (arr1[pointer1] == arr2[pointer2]) {
        nums[index] = arr2[pointer2];
        index++;
        pointer2++;
      }
    }
    while (pointer1 < arr1.length) {
      nums[index] = arr1[pointer1];
      pointer1++;
      index++;
    }
    while (pointer2 < arr2.length) {
      nums[index] = arr2[pointer2];
      pointer2++;
      index++;
    }
    return nums;
  }
}
