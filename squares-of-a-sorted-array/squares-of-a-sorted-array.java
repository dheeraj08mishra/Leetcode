class Solution {
    public int[] sortedSquares(int[] nums) {
    int num1[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            num1[i] = nums[i]*nums[i];
            
        }
        Arrays.sort(num1);
        return num1;
    }
}