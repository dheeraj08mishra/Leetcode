class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] pref = new int[nums.length];
        pref[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pref[i] = pref[i - 1] + nums[i];
        }
        int ans = -1;
        if (pref[nums.length - 1] - pref[0] == 0) {
            ans = 0;
            return ans;
        }

        for (int i = 1; i < nums.length - 1; i++) {
            if (pref[pref.length - 1] - pref[i] == pref[i - 1]) {
                ans = i;
                return ans;
            }
        }
        if (pref[pref.length - 2] == 0) {
            ans = pref.length - 1;
            return ans;
        }
        return ans;
    }
}