class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
            hs.add(Integer.parseInt(new StringBuilder(Integer.toString(nums[i])).reverse().toString()));
        }
        return hs.size();
    }
}