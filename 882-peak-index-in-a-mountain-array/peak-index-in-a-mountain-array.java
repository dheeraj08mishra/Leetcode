class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int ans = Integer.MIN_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == 0) {
                return arr[ans] > arr[mid] ? ans : mid;
            }
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                ans = mid - 1;
                end = mid - 1;
            } else if (arr[mid] < arr[mid + 1]) {
                ans = mid + 1;
                start = mid + 1;
            }
        }
        return -1;
    }
}