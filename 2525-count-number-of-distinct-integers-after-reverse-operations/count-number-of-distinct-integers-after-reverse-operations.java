class Solution {
    public int countDistinctIntegers(int[] nums) {
        int ans[] = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[nums.length + i] = reverseCurrent(nums[i]);
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < ans.length; i++) {
            hs.add(ans[i]);
        }
        return hs.size();
    }

    private static int reverseCurrent(int num) {
        String current = Integer.toString(num);
        StringBuilder sb = new StringBuilder(current);
        for (int i = 0; i < current.length() / 2; i++) {
            Character temp = current.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length() - i - 1));
            sb.setCharAt(sb.length() - 1 - i, temp);
        }
        return Integer.parseInt(sb.toString());
    }
}