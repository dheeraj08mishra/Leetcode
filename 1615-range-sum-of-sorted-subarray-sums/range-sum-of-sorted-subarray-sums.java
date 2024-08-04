class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                al.add(sum);
            }

        }
        Collections.sort(al);
        int sum = 0;
        for (int i = left - 1; i < right; i++) {
            sum = (sum+ al.get(i))%1000000007;
        }
        return sum;
    }

}