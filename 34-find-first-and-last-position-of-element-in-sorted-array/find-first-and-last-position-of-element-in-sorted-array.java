class Solution {
    public int[] searchRange(int[] nums, int target) {

        int start = 0, end = nums.length - 1;
        int startIndex = findStartIndex(nums, start, end, target);
        int LastIndex = findLastIndex(nums, start, end, target);
        int[] ans = new int[2];
        ans[0] = startIndex;
        ans[1] = LastIndex;
        return ans;
    }

    private static int findStartIndex(int[] nums, int start, int end, int target) {
        int mid = (start + end) / 2;
        int ans = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;
                // present = true;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private static int findLastIndex(int[] nums, int start, int end, int target) {
        int mid = (start + end) / 2;
        int ans = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}