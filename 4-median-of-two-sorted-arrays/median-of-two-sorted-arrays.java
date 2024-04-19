class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int pointer1 = 0, pointer2 = 0;
        int counter = 0;
        while (pointer1 < nums1.length && pointer2 < nums2.length) {
            if (nums1[pointer1] <= nums2[pointer2]) {
                mergedArray[counter] = nums1[pointer1];
                pointer1++;
                counter++;
            } else if (nums1[pointer1] > nums2[pointer2]) {
                mergedArray[counter] = nums2[pointer2];
                pointer2++;
                counter++;
            }
        }
        while (pointer1 < nums1.length) {
            mergedArray[counter] = nums1[pointer1];
            pointer1++;
            counter++;
        }
        while (pointer2 < nums2.length) {
            mergedArray[counter] = nums2[pointer2];
            pointer2++;
            counter++;
        }
        if (mergedArray.length % 2 == 0) {
            return (double) (mergedArray[mergedArray.length / 2] + mergedArray[(mergedArray.length / 2) - 1]) / 2;
        } else {
            return (double) (mergedArray[(mergedArray.length / 2)]);
        }
    }
}