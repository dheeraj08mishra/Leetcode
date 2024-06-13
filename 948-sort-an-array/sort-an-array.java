class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        int counter = 0;
        while (pq.size() > 0) {
            output[counter++] = pq.poll();
        }
        return output;
    }
}