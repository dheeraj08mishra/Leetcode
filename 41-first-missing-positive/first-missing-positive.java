class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            hs.add(nums[i]);
        }
        int min = 1;
        while (hs.contains(min)) {
            min++;
        }

        return min;
    }
}