class Solution {
    public int missingNumber(int[] nums) {
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
        }
        return ((nums.length)*(nums.length+1))/2-currentSum;
        
    }
}