class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];
        int currentIndex = 0;
        for (int i = 0; i < k; i++) {
            while (dq.size() > 0 && nums[i] > dq.getLast()) {
                dq.removeLast();
            }
            dq.addLast(nums[i]);
        }
        ans[currentIndex++] = dq.getFirst();

        int start = 1, end = k;
        while (end < nums.length) {
            if (nums[start - 1] == dq.getFirst()) {
                dq.removeFirst();
            }
            while (dq.size() > 0 && nums[end] > dq.getLast()) {
                dq.removeLast();
            }
            dq.addLast(nums[end]);
            ans[currentIndex++] = dq.getFirst();
            start++;
            end++;
        }
        return ans;
    }
}