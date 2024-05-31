class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            q.add(nums[i]);
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        while (q.size() > 2) {
            if (!hm.containsKey(q.peek())) {
                q.poll();
            } else {
                if (hm.get(q.peek()) > 1) {
                    hm.remove(q.poll());
                } else {
                    q.add(q.poll());
                }
            }
        }
        int[] ans = new int[2];
        ans[0] = q.poll();
        ans[1] = q.poll();
        return ans;
    }
}