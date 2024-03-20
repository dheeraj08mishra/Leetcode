class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long ans = Integer.MIN_VALUE;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        if (hm.size() == k) {
            ans = Math.max(ans, sum);
        } else {
            ans = 0;
        }

        int start = 1;
        int end = k;

        while (end < nums.length) {
            hm.put(nums[start - 1], hm.get(nums[start - 1]) - 1);
            sum = sum - nums[start - 1];
            if (hm.get(nums[start - 1]) == 0) {
                hm.remove(nums[start - 1]);
            }
            if (hm.containsKey(nums[end])) {
                hm.put(nums[end], hm.get(nums[end]) + 1);
                sum = sum + nums[end];

            } else {
                hm.put(nums[end], 1);
                sum = sum + nums[end];
                // ans = Math.max(ans, hashMapSum(hm, sum,k));
            }
            if (hm.size() == k) {
                ans = Math.max(ans, sum);
            }

            start++;
            end++;
        }
        return ans == Integer.MIN_VALUE ? 0 : ans;
    }

}