class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int[] pref = new int[nums.length];
        pref[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pref[i] = pref[i - 1] + nums[i];
        }
        int count = 0;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] == 0) {
                count++;
            }
        }
        return count;
    }
}