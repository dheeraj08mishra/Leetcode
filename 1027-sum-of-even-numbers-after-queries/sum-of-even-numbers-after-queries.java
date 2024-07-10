class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        int inital_even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                inital_even += nums[i];
            }
        }
        for (int i = 0; i < queries.length; i++) {
            if (nums[queries[i][1]] % 2 == 0) {
                inital_even = inital_even - nums[queries[i][1]];
                int currentSum = nums[queries[i][1]] + queries[i][0];
                if (currentSum % 2 == 0) {
                    inital_even += currentSum;
                }
            } else {
                if ((nums[queries[i][1]] + queries[i][0]) % 2 == 0) {
                    inital_even += nums[queries[i][1]] + queries[i][0];
                }
            }
            nums[queries[i][1]] += queries[i][0];
            ans[i] = inital_even;
        }
        return ans;
    }
}