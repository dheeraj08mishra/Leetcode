class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int p1 = 0, p2 = nums.length - 1;
        int count = 0;
        while (p1 < p2) {
            if (nums[p1] + nums[p2] == k) {
                count++;
                p1++;
                p2--;
            } else if (nums[p1] + nums[p2] > k) {
                p2--;
            } else {
                p1++;
            }
        }
        return count;
    }
}