class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = 0;
        int pointer2 = 0;
        int[] arrayAns = new int[m + n];
        int count = 0;
        while (pointer1 < m && pointer2 < n) {
            if (nums1[pointer1] <= nums2[pointer2]) {
                arrayAns[count] = nums1[pointer1];
                pointer1++;
                count++;
            } else if (nums1[pointer1] >= nums2[pointer2]) {
                arrayAns[count] = nums2[pointer2];
                pointer2++;
                count++;
            }
        }
        while (pointer1 < m) {
            arrayAns[count] = nums1[pointer1];
            pointer1++;
            count++;
        }
        while (pointer2 < n) {
            arrayAns[count] = nums2[pointer2];
            pointer2++;
            count++;
        }

        for (int i = 0; i < arrayAns.length; i++) {
            nums1[i] = arrayAns[i];
        }

    }
}