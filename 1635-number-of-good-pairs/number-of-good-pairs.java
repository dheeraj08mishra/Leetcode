class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        int ans =0;
        for(HashMap.Entry<Integer,Integer> map:hm.entrySet()){
            ans = ans+ (map.getValue()*(map.getValue()-1))/2;
        }
        return ans;
    }
}