class Solution {
    public long maximumTotalCost(int[] nums) {
        long add = nums[0];
        long sub = nums[0];
        for (int i = 1; i < nums.length; i++) {
            long temp1 = Math.max(add, sub) + nums[i];
            long temp2 = add - nums[i];

            add = temp1;
            sub = temp2;
        }
        return Math.max(add, sub);
    }
}