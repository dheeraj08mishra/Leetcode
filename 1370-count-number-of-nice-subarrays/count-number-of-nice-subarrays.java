class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int oddCount = 0;
        int result = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                oddCount++;
            }
            if (hm.containsKey(oddCount - k)) {
                result += hm.get(oddCount - k);
            }
            if (hm.containsKey(oddCount)) {
                hm.put(oddCount, hm.get(oddCount) + 1);
            } else {
                hm.put(oddCount, 1);
            }
        }

        return result;
    }
}