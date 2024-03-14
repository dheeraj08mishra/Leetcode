class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int pointer1=0,pointer2=1;

        while(pointer1<pointer2){
            if(nums[pointer1]==nums[pointer2]){
                return nums[pointer1];
            }else{
                pointer1++;
                pointer2++;
            }
        }
        return -1;
    }
}