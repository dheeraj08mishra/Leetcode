class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int pointer1 = 0;
        int pointer2 = 1;
         while (pointer1<pointer2 && pointer2<nums.length){
           if (nums[pointer1] % 2 != 0 && nums[pointer2] % 2 == 0) {
               int temp = nums[pointer1];
               nums[pointer1] = nums[pointer2];
               nums[pointer2] = temp;
               pointer1++;
               pointer2++;
           }  else if (nums[pointer1] % 2 != 0 && nums[pointer2] % 2 != 0) {
               pointer2++;
           } else if (nums[pointer1] % 2 == 0 && nums[pointer2] % 2 == 0) {
               pointer2++;
               pointer1++;
           }else{
               pointer2++;
               pointer1++;
           }
       }
        return nums;
    }
}