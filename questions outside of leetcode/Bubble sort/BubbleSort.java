class Solution {
    public int[] bubbleSort(int[] A) {
        bubble(A);
        return A;
    }
    private static int[] bubble(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                }
            }

        }
        return nums;
    }
    private static int[] swap(int[] nums, int j, int i) {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return nums;
    }
}
