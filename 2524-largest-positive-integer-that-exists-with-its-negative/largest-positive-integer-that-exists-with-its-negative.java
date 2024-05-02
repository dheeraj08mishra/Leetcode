class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer,Boolean> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],true);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                if(hm.containsKey(nums[i]*-1)){
                    if(max<(nums[i]*-1)){
                        max = -1*nums[i];
                    }
                }
            }
        }
        return max==Integer.MIN_VALUE?-1:max;
        
    }
}