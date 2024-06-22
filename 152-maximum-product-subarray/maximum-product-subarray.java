class Solution {
    public int maxProduct(int[] nums) {
        double prod1 = 1, max=Integer.MIN_VALUE, prod2 = 1;
        for (int i = 0; i < nums.length; i++) {
            prod1 = prod1 * nums[i];
            max = Math.max(max, prod1);
            if (prod1 == 0) {
                prod1 = 1;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            prod2 = prod2 * nums[i];
            max = Math.max(max, prod2);
            if (prod2 == 0) {
                prod2 = 1;
            }

        }
        return (int)max;
    }
}