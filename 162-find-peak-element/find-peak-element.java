class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1)
            return 0;
        if (nums.length == 2)
            return nums[0] > nums[1] ? 0 : 1;
        int first = 0, second = 1, third = 2;
        int max = 0;
        while (third < nums.length) {
            if (nums[second] > nums[first] && nums[second] > nums[third]) {
                return second;
            } else {
                if (nums[second] > nums[first]) {
                    max = second;
                    if (nums[third] > nums[second]) {
                        max = third;
                    }
                } else {
                    if (nums[third] > nums[first]) {
                        max = third;
                    }
                }

                first++;
                second++;
                third++;
            }
        }
        return max;
    }
}