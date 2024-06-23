class Solution {
    public boolean isArraySpecial(int[] nums) {
        int pointer1 = 0, pointer2 = 1;
        boolean flag = true;
        while (pointer2 < nums.length) {
            if ((nums[pointer1] % 2 == 0 && nums[pointer2] % 2 != 0) ||
                    (nums[pointer1] % 2 != 0 && nums[pointer2] % 2 == 0)) {
                pointer1++;
                pointer2++;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}