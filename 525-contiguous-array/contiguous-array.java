class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        int[] pf = new int[nums.length];
        pf[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pf[i] = pf[i - 1] + nums[i];
        }
        for (int i = 0; i < pf.length; i++) {
            int current = 0;
            if (hm.containsKey(pf[i])) {
                current = i - hm.get(pf[i]);
                ans = Math.max(ans, current);
            } else {
                hm.put(pf[i], i);
            }
        }
        return ans==Integer.MIN_VALUE?0:ans;

    }
}