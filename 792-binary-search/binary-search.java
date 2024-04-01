class Solution {
    public int search(int[] nums, int target) {
        boolean present = false;
        // if(nums.length==1 && nums[0]==target){
        //    return 0;
        // }
        int start = 0, end = nums.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}