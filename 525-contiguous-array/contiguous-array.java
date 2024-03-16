class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1); /// base case
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        int[] pf = new int[nums.length];
        pf[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pf[i] = nums[i] + pf[i - 1];
        }
        int ans = 0;
        for (int i = 0; i < pf.length; i++) {
            if (hm.containsKey(pf[i])) {
                ans = Math.max(ans,i - hm.get(pf[i]));

            } else {
                hm.put(pf[i], i);
            }
        }

        return ans;

    }
}