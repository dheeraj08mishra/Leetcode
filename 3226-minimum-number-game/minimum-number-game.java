class Solution {
    public int[] numberGame(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.sort(nums);
        int count = 0;
        // while (count <= (nums.length / 2)+1) {
        //     ans[count] = nums[count + 1];
        //     ans[count + 1] = nums[count];
        //     count = count + 2;
        // }
        for(int i=0;i<nums.length;i=i+2){
            ans[i+1] = nums[i];
        }
        for(int i=1;i<nums.length;i=i+2){
            ans[i-1] = nums[i];
        }
        return ans;

    }
}