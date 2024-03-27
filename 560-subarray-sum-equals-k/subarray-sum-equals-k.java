class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] pref = new int[nums.length];
        pref[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pref[i] = pref[i - 1] + nums[i];
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        hm.put(0, 1);
        for (int i = 0; i < pref.length; i++) {
            if (hm.containsKey(pref[i] - k)) {
                count += hm.get(pref[i] - k);
            }
            if (hm.containsKey(pref[i])) {
                hm.put(pref[i], hm.get(pref[i]) + 1);
            } else {
                hm.put(pref[i], 1);
            }
        }
        return count;

    }
}