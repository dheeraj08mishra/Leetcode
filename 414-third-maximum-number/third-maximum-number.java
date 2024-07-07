class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        int ans = pq.remove();
        int inital_ans = ans;
        int count = 1;
        while (!pq.isEmpty() && count < 3) {
            if (pq.peek() != ans) {
                count++;
                ans = pq.remove();
            } else {
                pq.remove();
            }
        }
        return count != 3 ? inital_ans : ans;
    }
}