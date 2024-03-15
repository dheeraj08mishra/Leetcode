class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        HashMap<Integer,Integer>hm1 = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm1.containsKey(target-nums[i])){
                ans[0]=hm1.get(target-nums[i]);
                ans[1] = i;
            } else{
                hm1.put(nums[i],i);
            }
        }
        return ans;
        
    }
}