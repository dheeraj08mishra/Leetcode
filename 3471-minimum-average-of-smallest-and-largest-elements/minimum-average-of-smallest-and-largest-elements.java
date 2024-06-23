class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int count = nums.length / 2;
        double smallest = Integer.MAX_VALUE;
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            double current = ((double) (nums[start] + nums[end])) / 2;
            smallest = Math.min(current, smallest);
            start++;
            end--;
        }
        return smallest;
    }
}