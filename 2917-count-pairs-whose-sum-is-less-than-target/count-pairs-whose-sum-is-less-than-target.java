class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        // brute force approch
        // for (int i = 0; i < nums.size(); i++) {
        // for (int j = i + 1; j < nums.size(); j++) {
        // if (nums.get(i) + nums.get(j) < target) {
        // count++;
        // }

        // }
        // }

        /// two pointer approch
        int p1 = 0, p2 = 1;
        Collections.sort(nums);
        while (p1 < nums.size() && p2 < nums.size()) {
            if (nums.get(p1) + nums.get(p2) < target) {
                count++;
                p2++;
                if (p2 == nums.size()) {
                    p1++;
                    p2 = p1 + 1;
                }
            } else {
                p1++;
                p2 = p1 + 1;
            }

        }

        return count;
    }
}