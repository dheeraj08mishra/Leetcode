class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k>= nums.length){
            return;
        }
         revseCode(nums,0,nums.length-1);
        revseCode(nums,0,k-1);
        revseCode(nums,k,nums.length-1);
        }
     private static void revseCode(int[] nums, int start, int end) {
        while (start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}