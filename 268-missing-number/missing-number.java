class Solution {
    public int missingNumber(int[] nums) {
        // int currentSum=0;
        // for(int i=0;i<nums.length;i++){
        // currentSum+=nums[i];
        // }
        // return ((nums.length)*(nums.length+1))/2-currentSum;

        // using XOR
        int givenXOR=0, toalXOR=0;
        for (int i = 0; i < nums.length; i++) {
            toalXOR ^= nums[i];
        }
        for (int i = 1; i <= nums.length; i++) {
            givenXOR ^= i;
        }

        return toalXOR ^ givenXOR;

    }
}