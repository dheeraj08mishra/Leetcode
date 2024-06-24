class Solution {
    public int minKBitFlips(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!dq.isEmpty() && i > dq.getFirst() + k - 1) {
                dq.removeFirst();
            }

            if ((nums[i] + dq.size()) % 2 == 0) {
                if (i + k > nums.length) {
                    return -1;
                } else {
                    res++;
                    dq.add(i);
                }
            }

        }
        return res;
    }
}