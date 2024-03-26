class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int p1 = 0, p2 = 1;
        int count = 0;
        int[] arr = new int[nums.length];
        while (p1 < nums.length && p2 < nums.length) {
            if (nums[p1] != nums[p2] && nums[p2] < nums[p1]) {
                count++;
                p2++;
            } else {
                p2++;
            }
            arr[p1] = count;
            if (p2 == nums.length) {
                p1++;
                p2 = 0;
                count = 0;
            }
        }
        return arr;
    }
}